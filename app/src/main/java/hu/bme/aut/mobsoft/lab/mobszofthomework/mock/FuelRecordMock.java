package hu.bme.aut.mobsoft.lab.mobszofthomework.mock;


import android.net.Uri;

import hu.bme.aut.mobsoft.lab.mobszofthomework.network.NetworkConfig;
import hu.bme.aut.mobsoft.lab.mobszofthomework.repository.MemoryRepository;
import utils.GsonHelper;

import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

import static hu.bme.aut.mobsoft.lab.mobszofthomework.mock.MockHelper.makeResponse;

public class FuelRecordMock {
    public static Response process(Request request) {
        Uri uri = Uri.parse(request.url().toString());

        String responseString = "";
        int responseCode = 0;
        Headers headers = request.headers();

        /*if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "Todos") && request.method().equals("POST")) {
            responseString = "";
            responseCode = 200;
        }else if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "Todos") && request.method().equals("Get")) {
            MemoryRepository memoryRepository = new MemoryRepository();
            memoryRepository.open(null);
            responseString = GsonHelper.getGson().toJson(memoryRepository.getFavourites());
            responseCode = 200;
        } else {
            responseString = "ERROR";
            responseCode = 503;
        }*/

        return makeResponse(request, headers, responseCode, responseString);
    }
}