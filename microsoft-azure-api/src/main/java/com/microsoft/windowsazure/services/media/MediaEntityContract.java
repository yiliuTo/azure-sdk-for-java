/**
 * Copyright 2012 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.windowsazure.services.media;

import com.microsoft.windowsazure.services.core.FilterableService;
import com.microsoft.windowsazure.services.core.ServiceException;
import com.microsoft.windowsazure.services.media.entities.EntityCreationOperation;
import com.microsoft.windowsazure.services.media.entities.EntityDeleteOperation;
import com.microsoft.windowsazure.services.media.entities.EntityGetOperation;
import com.microsoft.windowsazure.services.media.entities.EntityListOperation;
import com.microsoft.windowsazure.services.media.entities.EntityUpdateOperation;
import com.microsoft.windowsazure.services.media.models.ListResult;

/**
 * Contract for interacting with the back end service
 * providing various odata entities.
 * 
 */
public interface MediaEntityContract extends FilterableService<MediaEntityContract> {

    /**
     * Create a new instance of an entity
     * 
     * @param creator
     *            Object providing the details of the entity to be
     *            created
     * @return
     *         The created entity
     */
    <T> T create(EntityCreationOperation<T> creator) throws ServiceException;

    /**
     * Retrieve an existing entity by id
     * 
     * @param getter
     *            object providing the details of the entity to be retrieved
     * @return The retrieved entity
     * @throws ServiceException
     */
    <T> T get(EntityGetOperation<T> getter) throws ServiceException;

    /**
     * Retrieve a list of entities
     * 
     * @param lister
     *            object providing details of entities to list
     * @return The resulting list
     * @throws ServiceException
     */
    <T> ListResult<T> list(EntityListOperation<T> lister) throws ServiceException;

    /**
     * Update an existing asset
     * 
     * @param updater
     *            Object providing details of the update
     * @throws ServiceException
     */
    void update(EntityUpdateOperation updater) throws ServiceException;

    /**
     * Delete an asset
     * 
     * @param deleter
     *            Object providing details of the delete
     * @throws ServiceException
     */
    void delete(EntityDeleteOperation deleter) throws ServiceException;
}
