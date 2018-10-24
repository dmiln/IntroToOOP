package generics;

public class Cat extends Pet {
    @Override
    public void whoAmI() {
        System.out.println("I'm Cat");
    }

    @Override
    public void giveVoice() {
        System.out.println("Meow");
    }
}
