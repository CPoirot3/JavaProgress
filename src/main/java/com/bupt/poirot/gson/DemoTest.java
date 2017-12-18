package com.bupt.poirot.gson;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.Optional;

/**
 * Created by hui.chen on 2/2/17.
 */
public class DemoTest {
    public static void main(String[] args) {
        Gson gson = new Gson();
        User user = new User("怪盗kidou",24);
        String strFromObject = gson.toJson(user); // {"name":"怪盗kidou","age":24}
        System.out.println(strFromObject);

        User u = gson.fromJson(strFromObject, User.class);
        System.out.println(u.name);
        System.out.println(u.age);

        try (Writer writer = new FileWriter("Output.json")) {
            gson = new GsonBuilder().create();
            gson.toJson(u, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String jsonArray = "[\"Android\",\"Java\",\"PHP\"]";
        String[] strings = gson.fromJson(jsonArray, String[].class);
        for (String string : strings) {
            System.out.println(string);
        }

        List<String> stringList = gson.fromJson(jsonArray, new TypeToken<List<String>>() {}.getType());
        stringList.stream().forEach(System.out::println);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("test")));

        Optional<String> stringOptional = Optional.of("testOptional");
        System.out.println(stringOptional);
        if (stringOptional.isPresent()) {
            System.out.println(stringOptional.get());
        } else {
            System.out.println(stringOptional.get());
        }

    }
}
