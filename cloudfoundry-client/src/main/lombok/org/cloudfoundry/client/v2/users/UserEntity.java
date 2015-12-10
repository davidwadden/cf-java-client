/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.client.v2.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

/**
 * The entity response payload for the User resource
 */
@Data
public final class UserEntity {

    /**
     * The admin property
     *
     * @param admin the admin boolean
     * @return admin
     */
    private final boolean admin;

    /**
     * The active property
     *
     * @param active the active boolean
     * @return active
     */
    private final boolean active;

    /**
     * The Default Space Id
     *
     * @param defaultSpaceId default Space Id
     * @return default Space Id
     */
    private final String defaultSpaceId;

    /**
     * The username
     *
     * @param username the username
     * @return the username
     */
    private final String username;

    /**
     * The spaces url
     *
     * @param spacesUrl the spaces url
     * @return the spaces url
     */
    private final String spacesUrl;

    /**
     * The organizations url
     *
     * @param organizationsUrl the organizations url
     * @return the organizations url
     */
    private final String organizationsUrl;

    /**
     * The managed organizations url
     *
     * @param managedOrganizationsUrl the managed organizations url
     * @return the managed organizations url
     */
    private final String managedOrganizationsUrl;

    /**
     * The billing managed organizations url
     *
     * @param billingManagedOrganizationsUrl the billing managed organizations url
     * @return the billing managed organizations url
     */
    private final String billingManagedOrganizationsUrl;

    /**
     * The audited organizations url
     *
     * @param auditedOrganizationsUrl the audited organizations url
     * @return the audited organizations url
     */
    private final String auditedOrganizationsUrl;

    /**
     * The managed spaces url
     *
     * @param managedSpacesUrl the managed spaces url
     * @return the managed spaces url
     */
    private final String managedSpacesUrl;

    /**
     * The audited spaces url
     *
     * @param auditedSpacesUrl the audited spaces url
     * @return the audited spaces url
     */
    private final String auditedSpacesUrl;

    @Builder
    UserEntity(@JsonProperty("admin") boolean admin,
               @JsonProperty("active") boolean active,
               @JsonProperty("default_space_guid") String defaultSpaceId,
               @JsonProperty("username") String username,
               @JsonProperty("spaces_url") String spacesUrl,
               @JsonProperty("organizations_url") String organizationsUrl,
               @JsonProperty("managed_organizations_url") String managedOrganizationsUrl,
               @JsonProperty("billing_managed_organizations_url") String
                                           billingManagedOrganizationsUrl,
               @JsonProperty("audited_organizations_url") String auditedOrganizationsUrl,
               @JsonProperty("managed_spaces_url") String managedSpacesUrl,
               @JsonProperty("audited_spaces_url") String auditedSpacesUrl) {
        this.admin = admin;
        this.active = active;
        this.defaultSpaceId = defaultSpaceId;
        this.username = username;
        this.spacesUrl = spacesUrl;
        this.organizationsUrl = organizationsUrl;
        this.managedOrganizationsUrl = managedOrganizationsUrl;
        this.billingManagedOrganizationsUrl = billingManagedOrganizationsUrl;
        this.auditedOrganizationsUrl = auditedOrganizationsUrl;
        this.managedSpacesUrl = managedSpacesUrl;
        this.auditedSpacesUrl = auditedSpacesUrl;
    }

}