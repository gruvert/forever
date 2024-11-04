package ua.edu.ucu.apps.flowerstore.store;

// package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
    public Flower(Flower flower){
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
    }

}
