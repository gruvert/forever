package ua.edu.ucu.apps.flowerstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.flowerstore.store.Flower;
import ua.edu.ucu.apps.flowerstore.store.FlowerColor;
import ua.edu.ucu.apps.flowerstore.store.FlowerType;

@SpringBootApplication
@RestController
public class FlowerstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowerstoreApplication.class, args);
	}
	@GetMapping
	public Flower getflower(){
		return new Flower(45,FlowerColor.BLUE,0.8,FlowerType.ROSE);
	}

}
