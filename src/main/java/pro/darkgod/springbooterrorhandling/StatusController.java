package pro.darkgod.springbooterrorhandling;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * StatusController
 */
@RestController
@RequestMapping("/")
public class StatusController {

    @GetMapping
    String status() {
        return "Running!!!";
    }
}