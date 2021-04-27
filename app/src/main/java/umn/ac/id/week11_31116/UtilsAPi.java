package umn.ac.id.week11_31116;

public class UtilsAPi {
    public static final String BASE_URL_API = "https://jsonplaceholder.typicode.com/";


    public static InterfaceApi getApiSerivce() {
        return ApiClient.getClient(BASE_URL_API).create(InterfaceApi.class);
    }
}
