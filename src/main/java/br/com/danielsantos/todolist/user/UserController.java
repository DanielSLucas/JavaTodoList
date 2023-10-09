package br.com.danielsantos.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificadores:
 * public - qualquer um acessa
 * private - apenas alguns atributos podem ser acessados
 * protected - acessivel apenas dentro do pacote
 */
@RestController
@RequestMapping("/users")
public class UserController {
  /**
   * Possíveis retornos
   * String, Integer, Double, Float, char, Date
   * ou void (vazio)
   */
  @PostMapping("/")
  public void create(@RequestBody UserModel userModel) {
    System.out.println(userModel.name);
  }
}
