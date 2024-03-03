package ua.spro.soaphelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ws.config.annotation.EnableWs;

@SpringBootApplication
public class SoapHelloWorldApplication {

  public static void main(String[] args) {
    SpringApplication.run(SoapHelloWorldApplication.class, args);
  }
}
