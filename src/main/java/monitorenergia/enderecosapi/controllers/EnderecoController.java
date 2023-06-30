package monitorenergia.enderecosapi.controllers;

import monitorenergia.enderecosapi.dtos.EnderecoDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("enderecos")
public class EnderecoController {

    @PostMapping
    public String novo(@RequestBody @Validated EnderecoDTO enderecoDTO) {
        return "endereço OK";
    }
}
