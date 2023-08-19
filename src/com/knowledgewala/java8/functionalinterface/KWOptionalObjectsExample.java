package com.knowledgewala.java8.functionalinterface;

import java.util.Optional;

public class KWOptionalObjectsExample {
    public static void main(String[] args) {
        // Empty Object
        Optional<Object> emptyObject = Optional.empty();
        System.out.println(emptyObject.isEmpty());

        // of Method
        Optional<String> ofObject = Optional.of("ABC");
        System.out.println(ofObject.isEmpty());
        System.out.println(ofObject.get());

        // ofNullable
        Optional<String> ofNullableObject = Optional.ofNullable("ABC");
        System.out.println(ofNullableObject.isEmpty());
        System.out.println(ofNullableObject.isPresent());
        // ofNullableObject.orElseThrow(() -> new Exception());
        System.out.println(ofNullableObject.get());

        String email = "dharmendra@rediffmail.com";
        Optional<Object> emptyObject2 = Optional.empty();
        System.out.println(emptyObject2);
        Optional<String> email1 = Optional.of(email);
        System.out.println(email1);

        // email
        Optional<String> email2 = Optional.ofNullable(email);
        System.out.println(email2);

        System.out.println(email2.orElse("dhar@gmail.com"));

        String orElseGet = email2.orElseGet(() -> "defaultEmail@gmail.com");
        System.out.println(orElseGet);

        // orElseThrow
        Optional<String> email3 = Optional.ofNullable(email);
        String email_is_not_exist = email3.orElseThrow(() -> new IllegalArgumentException("Email is not exist"));
        System.out.println(email_is_not_exist);

        // assign null email object
        email = null;
        email3 = Optional.ofNullable(email);
        //email_is_not_exist = email3.orElseThrow(() -> new IllegalArgumentException("Email is not exist"));
        //System.out.println(email_is_not_exist);

        // filter method
        String str = "abc";
        if(str != null && str.contains("abc")){
            System.out.println(str);
        }

        Optional<String> str1 = Optional.of(str);
        str1.filter(res -> res.contains("abc"))
                .ifPresent((res) -> System.out.println(res));

        // map
        str1 = Optional.of(str);
        str1.filter(res -> res.contains("abc"))
                .map(String::toUpperCase)
                .ifPresent((res) -> System.out.println(res));

    }
}
