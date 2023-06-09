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

import { Player } from '../models/Player';
import { HttpFile } from '../http/http';

export class PlayersChunk {
    'numPlayer'?: number;
    'player'?: Array<Player>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "numPlayer",
            "baseName": "numPlayer",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "player",
            "baseName": "player",
            "type": "Array<Player>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return PlayersChunk.attributeTypeMap;
    }

    public constructor() {
    }
}

