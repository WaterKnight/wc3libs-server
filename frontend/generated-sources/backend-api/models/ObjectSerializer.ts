export * from '../models/CameraBounds';
export * from '../models/Flags';
export * from '../models/Fog';
export * from '../models/Force';
export * from '../models/ForceFlags';
export * from '../models/ForcesChunk';
export * from '../models/GameVersion';
export * from '../models/GraphicsModes';
export * from '../models/Item';
export * from '../models/ItemSet';
export * from '../models/LoadingScreen';
export * from '../models/Margins';
export * from '../models/Player';
export * from '../models/PlayerBitmap';
export * from '../models/PlayersChunk';
export * from '../models/Point2d';
export * from '../models/PrologueScreen';
export * from '../models/RandomItemTable';
export * from '../models/RandomItemTablesChunk';
export * from '../models/RandomUnitTable';
export * from '../models/RandomUnitTableRow';
export * from '../models/RandomUnitTablesChunk';
export * from '../models/Tech';
export * from '../models/TechsChunk';
export * from '../models/UnknownV0ToV3';
export * from '../models/UnknownV4ToV8';
export * from '../models/Upgrade';
export * from '../models/UpgradesChunk';
export * from '../models/W3W3i';
export * from '../models/W3char';
export * from '../models/W3id';
export * from '../models/W3str';
export * from '../models/WaterColor';

import { CameraBounds } from '../models/CameraBounds';
import { Flags } from '../models/Flags';
import { Fog, FogFogTypeEnum          } from '../models/Fog';
import { Force } from '../models/Force';
import { ForceFlags } from '../models/ForceFlags';
import { ForcesChunk } from '../models/ForcesChunk';
import { GameVersion } from '../models/GameVersion';
import { GraphicsModes } from '../models/GraphicsModes';
import { Item } from '../models/Item';
import { ItemSet } from '../models/ItemSet';
import { LoadingScreen } from '../models/LoadingScreen';
import { Margins } from '../models/Margins';
import { Player , PlayerControllerEnum  , PlayerRaceEnum          } from '../models/Player';
import { PlayerBitmap } from '../models/PlayerBitmap';
import { PlayersChunk } from '../models/PlayersChunk';
import { Point2d } from '../models/Point2d';
import { PrologueScreen } from '../models/PrologueScreen';
import { RandomItemTable } from '../models/RandomItemTable';
import { RandomItemTablesChunk } from '../models/RandomItemTablesChunk';
import { RandomUnitTable } from '../models/RandomUnitTable';
import { RandomUnitTableRow } from '../models/RandomUnitTableRow';
import { RandomUnitTablesChunk } from '../models/RandomUnitTablesChunk';
import { Tech } from '../models/Tech';
import { TechsChunk } from '../models/TechsChunk';
import { UnknownV0ToV3 } from '../models/UnknownV0ToV3';
import { UnknownV4ToV8 } from '../models/UnknownV4ToV8';
import { Upgrade } from '../models/Upgrade';
import { UpgradesChunk } from '../models/UpgradesChunk';
import { W3W3i                 , W3W3iTilesetEnum   , W3W3iGameDataSetEnum         , W3W3iScriptLanguageEnum   , W3W3iGameDataVersionEnum          } from '../models/W3W3i';
import { W3char } from '../models/W3char';
import { W3id } from '../models/W3id';
import { W3str } from '../models/W3str';
import { WaterColor } from '../models/WaterColor';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

const supportedMediaTypes: { [mediaType: string]: number } = {
  "application/json": Infinity,
  "application/octet-stream": 0,
  "application/x-www-form-urlencoded": 0
}


let enumsMap: Set<string> = new Set<string>([
    "FogFogTypeEnum",
    "PlayerControllerEnum",
    "PlayerRaceEnum",
    "W3W3iTilesetEnum",
    "W3W3iGameDataSetEnum",
    "W3W3iScriptLanguageEnum",
    "W3W3iGameDataVersionEnum",
]);

let typeMap: {[index: string]: any} = {
    "CameraBounds": CameraBounds,
    "Flags": Flags,
    "Fog": Fog,
    "Force": Force,
    "ForceFlags": ForceFlags,
    "ForcesChunk": ForcesChunk,
    "GameVersion": GameVersion,
    "GraphicsModes": GraphicsModes,
    "Item": Item,
    "ItemSet": ItemSet,
    "LoadingScreen": LoadingScreen,
    "Margins": Margins,
    "Player": Player,
    "PlayerBitmap": PlayerBitmap,
    "PlayersChunk": PlayersChunk,
    "Point2d": Point2d,
    "PrologueScreen": PrologueScreen,
    "RandomItemTable": RandomItemTable,
    "RandomItemTablesChunk": RandomItemTablesChunk,
    "RandomUnitTable": RandomUnitTable,
    "RandomUnitTableRow": RandomUnitTableRow,
    "RandomUnitTablesChunk": RandomUnitTablesChunk,
    "Tech": Tech,
    "TechsChunk": TechsChunk,
    "UnknownV0ToV3": UnknownV0ToV3,
    "UnknownV4ToV8": UnknownV4ToV8,
    "Upgrade": Upgrade,
    "UpgradesChunk": UpgradesChunk,
    "W3W3i": W3W3i,
    "W3char": W3char,
    "W3id": W3id,
    "W3str": W3str,
    "WaterColor": WaterColor,
}

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap.has(expectedType)) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string, format: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let date of data) {
                transformedData.push(ObjectSerializer.serialize(date, subType, format));
            }
            return transformedData;
        } else if (type === "Date") {
            if (format == "date") {
                let month = data.getMonth()+1
                month = month < 10 ? "0" + month.toString() : month.toString()
                let day = data.getDate();
                day = day < 10 ? "0" + day.toString() : day.toString();

                return data.getFullYear() + "-" + month + "-" + day;
            } else {
                return data.toISOString();
            }
        } else {
            if (enumsMap.has(type)) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }

            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let attributeType of attributeTypes) {
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type, attributeType.format);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string, format: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let date of data) {
                transformedData.push(ObjectSerializer.deserialize(date, subType, format));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap.has(type)) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let attributeType of attributeTypes) {
                let value = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type, attributeType.format);
                if (value !== undefined) {
                    instance[attributeType.name] = value;
                }
            }
            return instance;
        }
    }


    /**
     * Normalize media type
     *
     * We currently do not handle any media types attributes, i.e. anything
     * after a semicolon. All content is assumed to be UTF-8 compatible.
     */
    public static normalizeMediaType(mediaType: string | undefined): string | undefined {
        if (mediaType === undefined) {
            return undefined;
        }
        return mediaType.split(";")[0].trim().toLowerCase();
    }

    /**
     * From a list of possible media types, choose the one we can handle best.
     *
     * The order of the given media types does not have any impact on the choice
     * made.
     */
    public static getPreferredMediaType(mediaTypes: Array<string>): string {
        /** According to OAS 3 we should default to json */
        if (!mediaTypes) {
            return "application/json";
        }

        const normalMediaTypes = mediaTypes.map(this.normalizeMediaType);
        let selectedMediaType: string | undefined = undefined;
        let selectedRank: number = -Infinity;
        for (const mediaType of normalMediaTypes) {
            if (supportedMediaTypes[mediaType!] > selectedRank) {
                selectedMediaType = mediaType;
                selectedRank = supportedMediaTypes[mediaType!];
            }
        }

        if (selectedMediaType === undefined) {
            throw new Error("None of the given media types are supported: " + mediaTypes.join(", "));
        }

        return selectedMediaType!;
    }

    /**
     * Convert data to a string according the given media type
     */
    public static stringify(data: any, mediaType: string): string {
        if (mediaType === "text/plain") {
            return String(data);
        }

        if (mediaType === "application/json") {
            return JSON.stringify(data);
        }

        throw new Error("The mediaType " + mediaType + " is not supported by ObjectSerializer.stringify.");
    }

    /**
     * Parse data from a string according to the given media type
     */
    public static parse(rawData: string, mediaType: string | undefined) {
        if (mediaType === undefined) {
            throw new Error("Cannot parse content. No Content-Type defined.");
        }

        if (mediaType === "text/plain") {
            return rawData;
        }

        if (mediaType === "application/json") {
            return JSON.parse(rawData);
        }

        if (mediaType === "text/html") {
            return rawData;
        }

        throw new Error("The mediaType " + mediaType + " is not supported by ObjectSerializer.parse.");
    }
}
