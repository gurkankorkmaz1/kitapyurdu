package xrayToken;

import okhttp3.*;
import org.json.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class tokenfail {
    public static void main(String[] args) throws IOException {
        String endpoint = "https://xray.cloud.getxray.app/api/v1/import/execution";
        String bearerToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnQiOiI4NWZmMWUzMS1lZDQ2LTM1YTEtOGM0MC0wYzlkMmIxNDMwMWYiLCJhY2NvdW50SWQiOiI3MTIwMjA6YWZkNzJiZTQtODc5MC00MTg2LTg2ZjgtZDM4MTZlYWFkYjA2IiwiaXNYZWEiOmZhbHNlLCJpYXQiOjE2OTAzNTc2NzUsImV4cCI6MTY5MDQ0NDA3NSwiYXVkIjoiOTVDQzI0MjUwNzE1NEVCNjkxQ0Q5NTA1Q0U4Mjk0MjIiLCJpc3MiOiJjb20ueHBhbmRpdC5wbHVnaW5zLnhyYXkiLCJzdWIiOiI5NUNDMjQyNTA3MTU0RUI2OTFDRDk1MDVDRTgyOTQyMiJ9.UCv51U_pApYNs-T8mFppUuq8vcR59D_4bo4NJxtHU-8";


        JSONObject requestBody = new JSONObject();
        JSONObject info = new JSONObject();
        info.put("summary", "Execution of automated tests for release");
        info.put("description", "This execution is automatically created when importing execution results from an external source");
        info.put("startDate", "2023-09-03T11:37:00+03:00");
        info.put("finishDate", "2023-09-04T11:50:00+03:00");
        requestBody.put("info", info);
        JSONArray tests = new JSONArray();

        JSONObject test1 = new JSONObject();
        test1.put("testKey", "CAG-07");
        test1.put("start", "2023-09-03T11:37:00+03:00");
        test1.put("finish", "2023-09-04T11:50:00+03:00");
        test1.put("comment", "Successful execution1");
        test1.put("status", "FAILED");
        tests.put(test1);

        JSONObject test2 = new JSONObject();
        test2.put("testKey", "CAG-08");
        test2.put("start", "2023-09-03T11:37:00+03:00");
        test2.put("finish", "2023-09-04T11:50:00+03:00");
        test2.put("comment", "Successful execution2");
        test2.put("status", "FAILED");
        tests.put(test2);

        JSONObject test3 = new JSONObject();
        test3.put("testKey", "CAG-09");
        test3.put("start", "2023-09-03T11:37:00+03:00");
        test3.put("finish", "2023-09-04T11:50:00+03:00");
        test3.put("comment", "Successful execution3");
        test3.put("status", "FAILED");
        tests.put(test3);

        JSONObject test4 = new JSONObject();
        test4.put("testKey", "CAG-10");
        test4.put("start", "2023-09-03T11:37:00+03:00");
        test4.put("finish", "2023-09-04T11:50:00+03:00");
        test4.put("comment", "Successful execution3");
        test4.put("status", "FAILED");
        tests.put(test4);

        JSONObject test5 = new JSONObject();
        test5.put("testKey", "CAG-11");
        test5.put("start", "2023-09-03T11:37:00+03:00");
        test5.put("finish", "2023-09-04T11:50:00+03:00");
        test5.put("comment", "Successful execution3");
        test5.put("status", "FAILED");
        tests.put(test5);

        JSONObject test6 = new JSONObject();
        test6.put("testKey", "CAG-12");
        test6.put("start", "2023-09-03T11:37:00+03:00");
        test6.put("finish", "2023-09-04T11:50:00+03:00");
        test6.put("comment", "Successful execution3");
        test6.put("status", "FAILED");
        tests.put(test6);

        JSONObject test7 = new JSONObject();
        test7.put("testKey", "CAG-13");
        test7.put("start", "2023-09-03T11:37:00+03:00");
        test7.put("finish", "2023-09-04T11:50:00+03:00");
        test7.put("comment", "Successful execution3");
        test7.put("status", "FAILED");
        tests.put(test7);

        JSONObject test8 = new JSONObject();
        test8.put("testKey", "CAG-14");
        test8.put("start", "2023-09-03T11:37:00+03:00");
        test8.put("finish", "2023-09-04T11:50:00+03:00");
        test8.put("comment", "Successful execution3");
        test8.put("status", "FAILED");
        tests.put(test8);

        JSONObject test9 = new JSONObject();
        test9.put("testKey", "CAG-15");
        test9.put("start", "2023-09-03T11:37:00+03:00");
        test9.put("finish", "2023-09-04T11:50:00+03:00");
        test9.put("comment", "Successful execution3");
        test9.put("status", "FAILED");
        tests.put(test9);

        JSONObject test10 = new JSONObject();
        test10.put("testKey", "CAG-16");
        test10.put("start", "2023-09-03T11:37:00+03:00");
        test10.put("finish", "2023-09-04T11:50:00+03:00");
        test10.put("comment", "Successful execution3");
        test10.put("status", "FAILED");
        tests.put(test10);

        JSONObject test11 = new JSONObject();
        test11.put("testKey", "CAG-17");
        test11.put("start", "2023-09-03T11:37:00+03:00");
        test11.put("finish", "2023-09-04T11:50:00+03:00");
        test11.put("comment", "Successful execution3");
        test11.put("status", "FAILED");
        tests.put(test11);

        JSONObject test12 = new JSONObject();
        test12.put("testKey", "CAG-18");
        test12.put("start", "2023-09-03T11:37:00+03:00");
        test12.put("finish", "2023-09-04T11:50:00+03:00");
        test12.put("comment", "Successful execution3");
        test12.put("status", "FAILED");
        tests.put(test12);

        JSONObject test13 = new JSONObject();
        test13.put("testKey", "CAG-19");
        test13.put("start", "2023-09-03T11:37:00+03:00");
        test13.put("finish", "2023-09-04T11:50:00+03:00");
        test13.put("comment", "Successful execution3");
        test13.put("status", "FAILED");
        tests.put(test13);


        requestBody.put("tests", tests);



        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, requestBody.toString());
        Request request = new Request.Builder()
                .url(endpoint)
                .addHeader("Authorization", "Bearer " + bearerToken)
                .post(body)
                .build();


        Response response = client.newCall(request).execute();
        String responseBody = response.body().string();
        JSONObject jsonResponse = new JSONObject(responseBody);


        if (response.isSuccessful()) {
            System.out.println("Test execution created with key: " + jsonResponse.getString("key"));
        } else {
            System.out.println("Error creating test execution: " + jsonResponse.getString("error"));
        }
    }
}