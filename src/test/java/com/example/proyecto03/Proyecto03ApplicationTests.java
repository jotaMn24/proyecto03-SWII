package com.example.proyecto03;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;


import com.example.proyecto03.interfaces.IUsuario;

import com.example.proyecto03.modelo.Usuario;

@SpringBootTest
@RunWith(SpringRunner.class)
class EvaluacionContinua3ApplicationTests {
	@Autowired
	private BCryptPasswordEncoder encoder;
	@Autowired
	private IUsuario rep;

	@Test
	public void crearUsuariTest() {

		Usuario us = new Usuario();
		
		us.setUsername("docente");
		us.setPassword(encoder.encode("d18135"));
		Usuario retorno = rep.save(us);
		assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));
	}
}
