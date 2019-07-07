package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

import java.util.UUID;

@Configuration
public class MVCRoutesConfiguration {

    @Bean
    public RouterFunction<ServerResponse> routes() {
        return RouterFunctions.route()
                .GET("/api/person",
                        request -> ServerResponse.ok()
                                .body(new Person(UUID.randomUUID().toString(), "Bill")))
                .build();
    }

    public static class Person {

        private final String uid;

        private final String name;

        public Person(String uid, String name) {
            this.uid = uid;
            this.name = name;
        }

        public String getUid() {
            return uid;
        }

        public String getName() {
            return name;
        }
    }

}
