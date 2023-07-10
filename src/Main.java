public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck("Кролик",0.79,3);
        duck.walk();
        duck.move();
        System.out.println();
        Dog dog = new Dog("Барон",18.1,11);
        dog.walk();
        dog.move();
    }
}
