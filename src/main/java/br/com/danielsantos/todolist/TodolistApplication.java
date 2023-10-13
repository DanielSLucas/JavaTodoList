package br.com.danielsantos.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication {

	// Para rodar a aplicação clicar em "run"
	// OU digitar no terminal mvn spring-boot:run
	// OU pelo menu do vscode "java projects" no canto inferior esquesdo da tela
	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

}
