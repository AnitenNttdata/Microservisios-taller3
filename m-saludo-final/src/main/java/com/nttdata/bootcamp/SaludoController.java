package com.nttdata.bootcamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.msaludo.Saludo;

@RestController
public class SaludoController {
	@Autowired
	private Saludo saludo;
	
	@GetMapping(path= "/prueba")
	public String pruebaSaludo() {
		return saludo.mensajeSaludo();
	}

}
