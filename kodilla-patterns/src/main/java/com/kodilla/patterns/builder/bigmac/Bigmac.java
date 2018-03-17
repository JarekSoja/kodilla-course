package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {

    private final String roll;
    private final int numberOfBurgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String roll;
        private int numberOfBurgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder roll(String roll) {
            this.roll = roll;
            return this;
        }

        public BigmacBuilder numberOfBurgers(int numberOfBurgers) {
            this.numberOfBurgers = numberOfBurgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, numberOfBurgers, sauce, ingredients);
        }
    }

    private Bigmac(final String roll, final int numberOfBurgers, final String sauce, List<String> ingredients) {
        this.roll = roll;
        this.numberOfBurgers = numberOfBurgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getRoll() {
        return roll;
    }

    public int getNumberOfBurgers() {
        return numberOfBurgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "bigmac{" +
                "roll='" + roll + '\'' +
                "number of burgers=" + numberOfBurgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
