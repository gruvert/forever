package ua.edu.ucu.apps.flowerstore.orders;

import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.store.Item;
import ua.edu.ucu.apps.flowerstore.payments.Payment;

import java.util.LinkedList;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment paymentType) {
        this.payment = paymentType;
    }

    public void setDeliveryStrategy(Delivery deliveryType) {
        this.delivery = deliveryType;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item : items) {
            price += item.getPrice();
        }
        return price;
    }

    public void processOrder() {
        System.out.println("Payment: " + payment.getClass());
        System.out.println("Delivery: " + delivery.getClass());
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}