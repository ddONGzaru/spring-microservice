package io.manasobi;

import lombok.*;
import org.springframework.hateoas.ResourceSupport;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Greet extends ResourceSupport {

    private String message;
}
