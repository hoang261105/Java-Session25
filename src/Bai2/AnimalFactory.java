package Bai2;

public class AnimalFactory {
    public static Animal getAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("cat")) {
            return new Cat();
        }else if (animalType.equalsIgnoreCase("dog")) {
            return new Dog();
        }else{
            throw new IllegalArgumentException("Invalid animal type");
        }
    }
}
