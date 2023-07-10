public class Duck extends Animal {
    public Duck() {
    }
    public Duck(String nickName, Double weight, Integer age) {
        super(nickName, weight, age);
    }

    void move() {
        System.out.println("Утка по кличке " +  super.getNickName() + " летит в облаках");
    }
}
