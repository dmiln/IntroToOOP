package generics;

public class Pet extends Animal {
    @Override
    public void whoAmI() {
        System.out.println("I'm Pet");
    }

    public void giveVoice(){
        System.out.println("Pet");
    }
}
