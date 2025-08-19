package org.example;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) {
        Map<String, String> obj = new HashMap<>();
        obj.put("message", "Hello world!");

        Gson gson = new Gson();
        String json = gson.toJson(obj);

        System.out.println(json);

        int x = 10;
        int y = 5;
        System.out.println(x + y);
    }
}