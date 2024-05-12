package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/time")
public class Controller {

    @GetMapping("")
    public String currentDateTime() {
        return OffsetDateTime.now().toString();
    }
}
