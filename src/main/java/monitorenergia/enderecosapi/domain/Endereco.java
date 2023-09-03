package monitorenergia.enderecosapi.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Getter
@AllArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private @NotBlank String rua;
    private @NotBlank String numero;
    private @NotBlank String bairro;
    private @NotBlank String cidade;
    private @NotBlank @Size(min = 2, max = 2, message = "deve ter exatamente 2 caracteres") String uf;

    protected Endereco(){}
}
