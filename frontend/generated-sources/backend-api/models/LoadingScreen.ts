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

import { W3str } from '../models/W3str';
import { HttpFile } from '../http/http';

export class LoadingScreen {
    'loadingScreenIndex'?: number;
    'customLoadingScreenPath'?: W3str;
    'loadingScreenText'?: W3str;
    'loadingScreenTitle'?: W3str;
    'loadingScreenSubtitle'?: W3str;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "loadingScreenIndex",
            "baseName": "loadingScreenIndex",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "customLoadingScreenPath",
            "baseName": "customLoadingScreenPath",
            "type": "W3str",
            "format": ""
        },
        {
            "name": "loadingScreenText",
            "baseName": "loadingScreenText",
            "type": "W3str",
            "format": ""
        },
        {
            "name": "loadingScreenTitle",
            "baseName": "loadingScreenTitle",
            "type": "W3str",
            "format": ""
        },
        {
            "name": "loadingScreenSubtitle",
            "baseName": "loadingScreenSubtitle",
            "type": "W3str",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return LoadingScreen.attributeTypeMap;
    }

    public constructor() {
    }
}
