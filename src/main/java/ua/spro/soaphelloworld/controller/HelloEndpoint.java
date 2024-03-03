package ua.spro.soaphelloworld.controller;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import ua.spro.soaphelloworld.ws.HelloRequest;
import ua.spro.soaphelloworld.ws.HelloResponse;

@Endpoint
public class HelloEndpoint {
  private static final String NAMESPACE_URI = "http://localhost:8080/ws";

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "helloRequest")
  public HelloResponse sayHello(HelloRequest request){
    return HelloResponse.builder()
        .greeting("Hello, " + request.getName() + "!")
        .build();
  }
}
