package instanceOf;

public class Dog extends Animal{
    public Dog(String name){
        super();
    }

    @Override
    public String makeSound() {
        return "woof";
    }
}
