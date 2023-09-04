package monitorenergia.enderecosapi.controllers;

import lombok.AllArgsConstructor;
import monitorenergia.enderecosapi.domain.Endereco;
import monitorenergia.enderecosapi.dtos.EnderecoDTO;
import monitorenergia.enderecosapi.repository.EnderecoRepository;
import org.springframework.data.domain.Example;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("enderecos")
@AllArgsConstructor
public class EnderecoController {

    private EnderecoRepository enderecoRepository;

    @PostMapping
    public String novo(@RequestBody @Validated EnderecoDTO enderecoDTO) {
        enderecoRepository.save(enderecoDTO.toEntity(null));
        return "Endereço Salvo";
    }

    @GetMapping
    public List<Endereco> get(@RequestBody EnderecoDTO enderecoDTO) {
        Example<Endereco> example = Example.of(enderecoDTO.toEntity(null));
        return enderecoRepository.findAll(example);
    }

    @PutMapping("/{id}")
    public String atualizar(@PathVariable Integer id, @RequestBody @Validated EnderecoDTO enderecoDTO) {
        enderecoRepository.save(enderecoDTO.toEntity(id));
        return "Endereço Atualizado";
    }

    @DeleteMapping("/{id}")
    public String atualizar(@PathVariable Integer id) {
        enderecoRepository.deleteById(id);
        return "Endereço Removido";
    }
}
