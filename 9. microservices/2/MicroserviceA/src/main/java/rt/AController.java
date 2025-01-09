package rt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from MSA";
    }
}