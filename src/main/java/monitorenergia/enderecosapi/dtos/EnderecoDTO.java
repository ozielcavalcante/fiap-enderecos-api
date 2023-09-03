package monitorenergia.enderecosapi.dtos;

import jakarta.validation.constraints.*;
import monitorenergia.enderecosapi.domain.Endereco;

public record EnderecoDTO(
        Integer id,
        @NotBlank String rua,
        @NotBlank String numero,
        @NotBlank String bairro,
        @NotBlank String cidade,
        @NotBlank @Size(min = 2, max = 2, message = "deve ter exatamente 2 caracteres") String uf
) {
    public Endereco toEntity() {
        return new Endereco(
                id,
                rua,
                numero,
                bairro,
                cidade,
                uf
        );
    }
}
