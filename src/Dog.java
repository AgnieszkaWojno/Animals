public class Dog implements Animals {
    @Override
    public void speak() {
        System.out.println("Chauu chauu");
    }

    @Override
    public void eat() {
        System.out.println("eat same kibble");
    }

}
