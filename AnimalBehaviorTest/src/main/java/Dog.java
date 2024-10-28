public class Dog extends Animal {
    public Bark bark  = new Bark();
    @Override
    public void setSound(ISound sound) {
        super.setSound(bark);
    }

    @Override
    public void display() {
        System.out.println("Dog is displayed");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}