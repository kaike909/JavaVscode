package br.com.kaike.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.kaike.exerciciossb.models.entities.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {
        Cliente c1 = new Cliente(1, "Carlos", "440.465.398.01");
        return c1;
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorID1(@PathVariable int id) {
        return new Cliente(id, "Maria", "987-654-321.00");
    }

    @GetMapping
    public Cliente obterClientePorID2(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new Cliente(id, "Joao Augusto", "111.222.333-44");
    }

}
