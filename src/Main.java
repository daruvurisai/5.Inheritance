public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("Animal",1,1,5,50);
        Dog dog  = new Dog("Freezy",8,50,2,4,1,16,"Fur Silky");
        dog.eat();
        //dog.walk();
        dog.run();

        ClassB c = new ClassB();
        c.sum();
    }
}
