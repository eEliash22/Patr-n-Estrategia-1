public class Animal {
    private ISound soundBehavior;

    public void display() {
        System.out.println("Animal is displayed");
    }

    public void makeSound() {
        if (soundBehavior != null) {
            soundBehavior.sound();
        } else {
            System.out.println("No sound behavior set.");
        }
    }

    public void setSound(ISound sound) {
        this.soundBehavior = sound;
    }

    @Override
    public String toString() {
        return "Animal";
    }
}
