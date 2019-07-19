package api;

import groovy.json.internal.Exceptions;
import okhttp3.*;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginApi {

    @Test
    public void postLogin() throws Exception {

    OkHttpClient client = new OkHttpClient();

    MediaType mediaType = MediaType.parse("application/json");
    RequestBody body = RequestBody.create(mediaType, "{\n    \"username\": \"admin\",\n    \"password\": \"JEibr6AdmL\"\n}");
    Request request = new Request.Builder()
            .url("https://api-dev.cloudfmsense.io/admin_users/login")
            .post(body)
            .addHeader("Accept", "application/json, application/xml, text/xml, application/javascript, text/javascript")
            .addHeader("Content-Type", "application/json")
            .addHeader("cache-control", "no-cache")
            .addHeader("Postman-Token", "35332b8d-8f1b-454b-aa16-1c94363713f5")
            .build();

    Response response = client.newCall(request).execute();
    System.out.println(response);
}
}
