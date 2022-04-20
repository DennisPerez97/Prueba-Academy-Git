package com.courses.git.springboothelloworld.constants;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import lombok.AccessLevel;

/**
 * Clase de mensajes generales dela aplicacion.
 */
@Component
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Messages {

  /**
   * Constante de mensaje de hola.
   */
  @Value("${constant.saludo}")
  private String helloMesage;

}
