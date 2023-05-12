import { useCallback } from "react"
import { useDropzone } from "react-dropzone"
import { BACKEND_BASE_URL } from "./config";

type W3CDropZoneProps = {
  onResponse: (val: string) => void;
}

export const W3CDropZone = ({onResponse}: W3CDropZoneProps) => {
  const onDrop = useCallback((acceptedFiles: any) => {
    console.log(acceptedFiles[0]);
    fetch(BACKEND_BASE_URL + '/w3c', {
      method: 'POST',
      body: acceptedFiles[0]
    })
    .then(response => response.text())
    .then(response => onResponse(response));
  }, [onResponse])
  const {getRootProps, getInputProps, isDragActive} = useDropzone({onDrop})

  return (
    <div {...getRootProps()} style={{
      border: '1px dashed grey'
    }}>
      <input {...getInputProps()} />
      {
        isDragActive ?
          <p>Drop the files here ...</p> :
          <p>Drag 'n' drop some files here, or click to select files</p>
      }
    </div>
  )
}