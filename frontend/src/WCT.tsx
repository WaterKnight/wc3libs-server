import { useState, useCallback } from "react";
import SyntaxHighlighter from "react-syntax-highlighter";
import { WCTDropZone } from "./WCTDropZone";

export const WCT = () => {
  const [text, setText] = useState<string>();

  const handleResponse = useCallback((response: string) => {
    setText(response);
  }, []);

  return (
    <div className="App">
      WCT
      <WCTDropZone onResponse={handleResponse} />
      {/* {text && <pre style={{textAlign: 'left'}}>{JSON.stringify(JSON.parse(text), null, 2)}</pre>} */}
      {text && <SyntaxHighlighter language="json" customStyle={{
        textAlign: 'left'
      }}>
        {JSON.stringify(JSON.parse(text), null, 2)}
      </SyntaxHighlighter>}
    </div>
  );
}