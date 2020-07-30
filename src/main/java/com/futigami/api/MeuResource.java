package com.futigami.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class MeuResource {

    @PostMapping
    //@ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar(@RequestBody Cliente cliente){
        //service.save(cliente);
        return cliente;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete( @PathVariable Long id){
        //service.buscarPorId(id);
        //service.delete(cliente);
    }

    @PutMapping("{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        //service.buscaPorId(id);
        //service.update(cliente);
        return cliente;
    }

    //@RequestMapping(value = "/api/clientes/{id}", method = RequestMethod.GET)
    @GetMapping("{id}")
    public Cliente obterDadosCliente(@PathVariable Long id){
        Cliente cliente = new Cliente("Alguem", "000.000.000-0");
        return cliente;
    }


}
