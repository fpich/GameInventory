package model;

public class Item {
    private String name;
    private String type;
    private String rarity;
    private int powerEffect;
    private int price;
    private double weight;
    private int levelRequired;
    private int durability;
    private String description;
    private boolean isUsable;  // Nouvel attribut booléen

    public Item(String name, String type, String rarity, int powerEffect, int price, double weight, int levelRequired, int durability, String description, boolean isUsable) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.powerEffect = powerEffect;
        this.price = price;
        this.weight = weight;
        this.levelRequired = levelRequired;
        this.durability = durability;
        this.description = description;
        this.isUsable = isUsable;
    }

    // Getters et Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public int getPowerEffect() {
        return powerEffect;
    }

    public void setPowerEffect(int powerEffect) {
        this.powerEffect = powerEffect;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLevelRequired() {
        return levelRequired;
    }

    public void setLevelRequired(int levelRequired) {
        this.levelRequired = levelRequired;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isUsable() {
        return isUsable;
    }

    public void setUsable(boolean isUsable) {
        this.isUsable = isUsable;
    }

    @Override
    public String toString() {
        return name + " - " + type + " (" + rarity + ") - Effet: +" + powerEffect + " - Prix: " + price + " ors - Poids: " + weight + " kg - Niveau requis: " + levelRequired + " - Durabilité: " + durability + " - Utilisable: " + isUsable + "\nDescription: " + description;
    }
}

