/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Thing (entity type: "https://schema.org/Thing").
 */
public class Thing {
    /**
     * The type of the thing.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The name of the thing.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param withType the type value to set
     */
    public void setType(String withType) {
        this.type = withType;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param withName the name value to set
     */
    public void setName(String withName) {
        this.name = withName;
    }
}