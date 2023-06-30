package monitorenergia.enderecosapi.dtos;

import jakarta.validation.constraints.*;

public record EnderecoDTO(
        @NotBlank String rua,
        @NotBlank String numero,
        @NotBlank String bairro,
        @NotBlank String cidade,
        @NotBlank @Size(min = 2, max = 2, message = "deve ter exatamente 2 caracteres") String uf
) {
}
