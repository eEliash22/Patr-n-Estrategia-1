public class Cat extends Animal {
    public Meow meow = new Meow();
    @Override
    public void display() {
        System.out.println("Cat is displayed");
    }

    @Override
    public void setSound(ISound sound) {
        super.setSound(meow);
    }

    @Override
    public String toString() {
        return "Cat";
    }
}