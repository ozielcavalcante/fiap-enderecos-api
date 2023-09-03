package monitorenergia.enderecosapi.controllers;

import lombok.AllArgsConstructor;
import monitorenergia.enderecosapi.dtos.EnderecoDTO;
import monitorenergia.enderecosapi.repository.EnderecoRepository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("enderecos")
@AllArgsConstructor
public class EnderecoController {

    private EnderecoRepository enderecoRepository;

    @PostMapping
    public String novo(@RequestBody @Validated EnderecoDTO enderecoDTO) {
        enderecoRepository.save(enderecoDTO.toEntity());
        return "endereço OK";
    }
}
