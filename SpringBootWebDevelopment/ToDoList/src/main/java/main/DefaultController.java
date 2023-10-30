package main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class DefaultController {

    @RequestMapping("/")
    public String index() {

        double random = Math.random() * 1000;
        StringBuilder builder = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        builder.append(LocalDateTime.now().format(formatter)).append(System.lineSeparator())
                .append("Случайное число : ").append((int)random);

        return builder.toString();
    }
}
