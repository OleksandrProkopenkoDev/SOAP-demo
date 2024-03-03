package ua.spro.soaphelloworld.ws;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class HelloResponse {
  private String greeting;
}
