package senac.apicomercial.Cliente;


import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@Entity (name = "CLIENTE")

public class Cliente {

    @Id
    @GeneratedValue
    private Long id;

}
