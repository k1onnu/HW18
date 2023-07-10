public class Animal {
    private String nickName;
    private Double weight;
    private Integer age;

    public Animal() {
    }
    public Animal(String nickName, Double weight, Integer age) {
        this.nickName = nickName;
        this.weight = weight;
        this.age = age;
    }

    void walk() {
        System.out.println("Животное идёт по земле");
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
