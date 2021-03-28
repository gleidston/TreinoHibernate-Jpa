package com.gleidston.zup.vacinas.domain;

import com.gleidston.zup.vacinas.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class userTeste {
    @Test
    public void  criar (){
     User u = new User (1,
             "Pantera Cor-de-Rosa",
             "pantera@gmail.com",
             "222.333.444-55",
             LocalDate.of(1969,9,06)
             );
     System.out.println(u.toString());
    }
}
