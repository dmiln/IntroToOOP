package generics;

public class Dog extends Pet {
    @Override
    public void whoAmI() {
        System.out.println("I'm dog");
    }

    @Override
    public void giveVoice() {
        System.out.println("Bark");
    }
}
