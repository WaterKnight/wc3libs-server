/**
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class GraphicsModes {
    'rest'?: Array<boolean>;
    'sd'?: boolean;
    'hd'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "rest",
            "baseName": "rest",
            "type": "Array<boolean>",
            "format": ""
        },
        {
            "name": "sd",
            "baseName": "sd",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "hd",
            "baseName": "hd",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return GraphicsModes.attributeTypeMap;
    }

    public constructor() {
    }
}

