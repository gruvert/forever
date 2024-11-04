package ua.edu.ucu.apps.flowerstore.orders;

import java.util.List;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.flowerstore.store.Flower;

@SpringBootApplication
@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    @GetMapping("/list")
    public List<Flower> flowers() {
        return List.of(new Flower());
    }
    
}