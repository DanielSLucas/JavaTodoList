package br.com.danielsantos.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
  
  @Autowired
  private IUserRepository userRepository;
  /**
   * Possíveis retornos
   * String, Integer, Double, Float, char, Date
   * ou void (vazio)
   */
  @PostMapping("/")
  public ResponseEntity create(@RequestBody UserModel userModel) {
    var user = this.userRepository.findByUsername(userModel.getUsername());
    
    if(user != null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe");
    }

    var userCreated = this.userRepository.save(userModel);

    return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
  }
}
