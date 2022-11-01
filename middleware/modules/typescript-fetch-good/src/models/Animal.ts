/* tslint:disable */
/* eslint-disable */
/**
 * openapi quirks documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from "../runtime";
import { FishFromJSONTyped, MammalFromJSONTyped } from "./";

/**
 *
 * @export
 * @interface Animal
 */
export interface Animal {
  /**
   *
   * @type {string}
   * @memberof Animal
   */
  awesomeTypeInfoAndDiscriminator: string;
  /**
   *
   * @type {string}
   * @memberof Animal
   */
  label?: string;
}

/**
 * Check if a given object implements the Animal interface.
 */
export function instanceOfAnimal(value: object): boolean {
  let isInstance = true;
  isInstance = isInstance && "awesomeTypeInfoAndDiscriminator" in value;

  return isInstance;
}

export function AnimalFromJSON(json: any): Animal {
  return AnimalFromJSONTyped(json, false);
}

export function AnimalFromJSONTyped(
  json: any,
  ignoreDiscriminator: boolean
): Animal {
  if (json === undefined || json === null) {
    return json;
  }
  if (!ignoreDiscriminator) {
    if (json["awesomeTypeInfoAndDiscriminator"] === "fish") {
      return FishFromJSONTyped(json, true);
    }
    if (json["awesomeTypeInfoAndDiscriminator"] === "mammal") {
      return MammalFromJSONTyped(json, true);
    }
  }
  return {
    awesomeTypeInfoAndDiscriminator: json["awesomeTypeInfoAndDiscriminator"],
    label: !exists(json, "label") ? undefined : json["label"],
  };
}

export function AnimalToJSON(value?: Animal | null): any {
  if (value === undefined) {
    return undefined;
  }
  if (value === null) {
    return null;
  }
  return {
    awesomeTypeInfoAndDiscriminator: value.awesomeTypeInfoAndDiscriminator,
    label: value.label,
  };
}