/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import java.io.File;
import org.openapitools.client.model.ModelApiResponse;
import org.openapitools.client.model.Pet;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * API tests for PetApi
 */
@Ignore
public class PetApiTest {

    private final PetApi api = new PetApi();

    
    /**
     * Add a new pet to the store
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void addPetTest() throws IOException {
        Pet pet = null;
        api.addPet(pet);

        // TODO: test validations
    }
    
    /**
     * Deletes a pet
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void deletePetTest() throws IOException {
        Long petId = null;
        String apiKey = null;
        api.deletePet(petId, apiKey);

        // TODO: test validations
    }
    
    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void findPetsByStatusTest() throws IOException {
        List<String> status = null;
        List<Pet> response = api.findPetsByStatus(status);

        // TODO: test validations
    }
    
    /**
     * Finds Pets by tags
     *
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void findPetsByTagsTest() throws IOException {
        Set<String> tags = null;
        Set<Pet> response = api.findPetsByTags(tags);

        // TODO: test validations
    }
    
    /**
     * Find pet by ID
     *
     * Returns a single pet
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void getPetByIdTest() throws IOException {
        Long petId = null;
        Pet response = api.getPetById(petId);

        // TODO: test validations
    }
    
    /**
     * Update an existing pet
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void updatePetTest() throws IOException {
        Pet pet = null;
        api.updatePet(pet);

        // TODO: test validations
    }
    
    /**
     * Updates a pet in the store with form data
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void updatePetWithFormTest() throws IOException {
        Long petId = null;
        String name = null;
        String status = null;
        api.updatePetWithForm(petId, name, status);

        // TODO: test validations
    }
    
    /**
     * uploads an image
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void uploadFileTest() throws IOException {
        Long petId = null;
        String additionalMetadata = null;
        File file = null;
        ModelApiResponse response = api.uploadFile(petId, additionalMetadata, file);

        // TODO: test validations
    }
    
}
