package com.courses.git.springboothelloworld.bussiness;

import com.courses.git.springboothelloworld.constants.Messages;
import com.courses.git.springboothelloworld.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldBussiness implements HelloWorldService {

  @Override
  public String sayHello() {
    return Messages.HELLO_MESSAGE;
  }
}
