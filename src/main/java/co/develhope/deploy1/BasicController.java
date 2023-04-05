package co.develhope.deploy1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Value("${myCustomEnvs.devName}")
    String name;


    @GetMapping("/name")
    public String devName(){
        return name;
    }


}