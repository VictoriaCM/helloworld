package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "<b>Hello Turma 68!!!</b> Segunda frase";

	}

	@GetMapping("/top")
	public String top() {
		return "<b>Hello Turma 68 TOP!!!</b>";

	}

	@GetMapping("/bomdia")
	public String bomDia() {
		return "<b>Bom dia Turma 68!!!</b>";

	}

	@GetMapping("/helloworld")
	public String helloWorld() {
		return "<b>Hello World!</b>";

	}

	@GetMapping("/bsm")
	public String bsm() {
		return "<b>Lista de BSMs:</b><br>" + "Mentalidade de Crescimento<br>" + "Orientação ao Futuro<br>"
				+ "Persistência<br>" + "Comunicação<br>" + "Atenção para Detalhes<br>" + "Trabalho em Equipe<br>"
				+ "Proatividade<br>" + "Responsabilidade Pessoal";
	}

	@GetMapping("/aprendizagem")
	public String aprendizagem() {
		return "<b>Objetivos de aprendizagem da semana:</b><br>" + "Revisar conteúdos de MySQL e Spring<br>"
				+ "Fazer lista de exercícios MySQL<br>" + "Procurar mini cursos de design";
	}

}
