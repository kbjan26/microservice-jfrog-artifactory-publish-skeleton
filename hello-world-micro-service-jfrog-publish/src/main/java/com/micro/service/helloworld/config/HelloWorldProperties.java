package com.micro.service.helloworld.config;

import lombok.Data;
import lombok.NonNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

@ConfigurationProperties("checkout")
@Data
@Component
@Validated
public class HelloWorldProperties {

     @Valid
     private String greetings;

     @Valid
     @NonNull
     private Database database =new Database();

     @Data
     public static class Database {
          @NotEmpty
          private String name;
          @NotEmpty
          private String port;
          @NotEmpty
          private String username;
          @NotEmpty
          private String password;
     }
}
