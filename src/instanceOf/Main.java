package instanceOf;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        ArrayList<Animal> animals = new ArrayList<>();
        Dog dog = new Dog("doggy");
        Cat cat = new Cat("kitty");
        animals.add(dog);
        animals.add(cat);

        for (Animal animal: animals){
            if(animal instanceof Cat cat1){
                System.out.println(cat1.makeSound());
            }
            if (animal instanceof Dog dog1){
                System.out.println(dog1.makeSound());
            }
        }
    }
}
