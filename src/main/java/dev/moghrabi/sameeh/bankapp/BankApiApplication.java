package dev.moghrabi.sameeh.bankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApiApplication {
    //TODO Entities should be converted to Dtos in order to resolve infinite recursion problem
    // and to only show the necessary info for the end user
    //TODO Handling of remaining exceptions
    //TODO Handling of request bodies
    //TODO handling of validations
    //TODO use enum for constants instead of class
    //TODO add logs
    //TODO Response entity
    public static void main(String[] args) {
        SpringApplication.run(BankApiApplication.class, args);
    }
}
