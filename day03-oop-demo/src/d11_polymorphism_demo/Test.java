package d11_polymorphism_demo;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.run();
        some(new Dog());

        Animal a1 = new Cat();
        a1.run();

    }
    public static void some(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.way();
        }
    }
}
