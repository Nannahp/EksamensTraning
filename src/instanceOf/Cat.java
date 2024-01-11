package instanceOf;

public class Cat extends Animal{
    public Cat(String name){
        super();
    }

    @Override
    public String makeSound() {
        return "meow";
    }
}
