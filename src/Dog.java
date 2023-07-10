public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String nickName, Double weight, Integer age) {
        super(nickName, weight, age);
    }

    void move() {
        System.out.println("Собака по кличке " +  super.getNickName() + " бежит по земле");
    }
}
