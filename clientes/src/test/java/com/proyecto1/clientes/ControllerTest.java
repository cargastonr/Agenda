package com.proyecto1.clientes;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.proyecto1.clientes.Dto.ClienteDto;
import com.proyecto1.clientes.Service.ClienteService;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class ControllerTest {

	  @Autowired
	  private ClienteService service;
 @PostMapping("/create")
  public Mono<ClienteDto> saveCliente(@RequestBody Mono<ClienteDto> clienteDtoMono){
     
      return service.saveCliente(clienteDtoMono);
  }
}
