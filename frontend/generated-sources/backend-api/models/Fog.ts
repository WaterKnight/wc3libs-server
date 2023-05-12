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

export class Fog {
    'fogType'?: FogFogTypeEnum;
    'fogZStart'?: number;
    'fogZEnd'?: number;
    'fogDensity'?: number;
    'fogColorBlue'?: number;
    'fogColorGreen'?: number;
    'fogColorRed'?: number;
    'fogColorAlpha'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "fogType",
            "baseName": "fogType",
            "type": "FogFogTypeEnum",
            "format": ""
        },
        {
            "name": "fogZStart",
            "baseName": "fogZStart",
            "type": "number",
            "format": "float"
        },
        {
            "name": "fogZEnd",
            "baseName": "fogZEnd",
            "type": "number",
            "format": "float"
        },
        {
            "name": "fogDensity",
            "baseName": "fogDensity",
            "type": "number",
            "format": "float"
        },
        {
            "name": "fogColorBlue",
            "baseName": "fogColorBlue",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "fogColorGreen",
            "baseName": "fogColorGreen",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "fogColorRed",
            "baseName": "fogColorRed",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "fogColorAlpha",
            "baseName": "fogColorAlpha",
            "type": "number",
            "format": "int32"
        }    ];

    static getAttributeTypeMap() {
        return Fog.attributeTypeMap;
    }

    public constructor() {
    }
}


export type FogFogTypeEnum = "LINEAR" | "EXP" | "EXP2" ;

