package com.foodiedelight.app.utility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.foodiedelight.app.model.Restaurant;
import com.foodiedelight.app.repo.RestaurantRepository;

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(RestaurantRepository repository) {
        return args -> {
            repository.save(new Restaurant(
                    null,
                    "The Gourmet Kitchen",
                    "123 Foodie St, Culinary City",
                    "Italian",
                    "A fine dining experience with authentic Italian cuisine.",
                    "123-456-7890",
                    "contact@gourmetkitchen.com",
                    "http://www.gourmetkitchen.com",
                    true,
                    4
            ));
            repository.save(new Restaurant(
                    null,
                    "Spice Symphony",
                    "456 Spicy Road, Mumbai, MH",
                    "Indian",
                    "An explosion of flavors with traditional Indian dishes.",
                    "022-2345-6789",
                    "info@spicesymphony.in",
                    "http://www.spicesymphony.in",
                    true,
                    3
            ));

            repository.save(new Restaurant(
                    null,
                    "Curry Corner",
                    "789 Masala Ave, Chennai, TN",
                    "Indian",
                    "Home of the best South Indian cuisine with a modern twist.",
                    "044-2233-4455",
                    "contact@curryc.in",
                    "http://www.curryc.in",
                    true,
                    5
            ));

            repository.save(new Restaurant(
                    null,
                    "Royal Punjab",
                    "101 Heritage Lane, Amritsar, PB",
                    "Punjabi",
                    "Traditional Punjabi food with rich, bold flavors.",
                    "0183-555-6677",
                    "royal@punjabheritage.com",
                    "http://www.royalpunjab.com",
                    true,
                    4
            ));

            repository.save(new Restaurant(
                    null,
                    "Nizam's Delight",
                    "303 Charminar St, Hyderabad, TG",
                    "Hyderabadi",
                    "The royal taste of Hyderabad with authentic biryanis and kebabs.",
                    "040-1234-5678",
                    "nizams@delight.in",
                    "http://www.nizamsdelight.com",
                    true,
                    2
            ));

            repository.save(new Restaurant(
                    null,
                    "Kolkata Kuisine",
                    "202 Rosogolla Rd, Kolkata, WB",
                    "Bengali",
                    "Savor the sweetness of Bengali desserts and delicacies.",
                    "033-9876-5432",
                    "hello@kolkatakuisine.com",
                    "http://www.kolkatakuisine.com",
                    true,
                    2
            ));

            repository.save(new Restaurant(
                    null,
                    "Taste of Kerala",
                    "505 Coconut Grove, Kochi, KL",
                    "Kerala",
                    "Experience the authentic taste of Kerala with our traditional menu.",
                    "0484-765-4321",
                    "contact@tasteofkerala.in",
                    "http://www.tasteofkerala.in",
                    true,
                    5
            ));
        };
    }
}
