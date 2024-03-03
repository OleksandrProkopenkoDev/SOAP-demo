package ua.spro.soaphelloworld.ws;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class HelloRequest {

  private String name;
}
