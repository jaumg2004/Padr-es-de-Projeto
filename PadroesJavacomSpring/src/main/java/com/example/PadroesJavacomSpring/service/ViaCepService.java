package com.example.PadroesJavacomSpring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.PadroesJavacomSpring.model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping(value = "/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);

}
