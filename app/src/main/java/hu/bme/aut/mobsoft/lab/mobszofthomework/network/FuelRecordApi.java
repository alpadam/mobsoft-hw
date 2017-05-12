package hu.bme.aut.mobsoft.lab.mobszofthomework.network;


import hu.bme.aut.mobsoft.lab.mobszofthomework.model.FuelRecord;
import retrofit2.Call;
import retrofit2.http.*;
import java.util.List;

public interface FuelRecordApi {

    /**
     * Get fuel records.
     * The endpoint returns information about the fuel records. The response includes the basic details about each records.
     * @return Call<List<FuelRecord>>
     */

    @GET("records")
    Call<List<FuelRecord>> recordsGet();



    /**
     * New Recipe.
     * This request is used for creating a recipe.
     * @param recipe New Fuel record details.
     * @return Call<Void>
     */

    @POST("records")
    Call<Void> recordsPost(
            @Body FuelRecord recipe
    );


    /**
     * Fuel records.
     * The endpoint returns information about fuel records connectod to a specific user. The response includes the basic details about the recipes indentified by the userid.
     * @param uid Unique user identifier.
     * @return Call<FuelRecord>
     */

    @GET("records/{uid}")
    Call<FuelRecord> recordsUidGet(
            @Path("uid") Long uid
    );


    /**
     * Delete fuel record.
     * This request is used for deleting a fuel record.
     * @param uid Unique fuel record identifier.
     * @return Call<Void>
     */

    @DELETE("records/{uid}")
    Call<Void> recordsUidDelete(
            @Path("uid") Long uid
    );
}