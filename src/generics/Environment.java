package generics;

import java.util.ArrayList;
import java.util.List;

public class Environment {

    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Cat());
        pets.add(new Pet());
        pets.add(new Dog());
        pets.add(new Dog());
        pets.add(new Cat());

        for (Pet p : pets) {
            p.whoAmI();
            p.giveVoice();
        }
        System.out.println();
        System.out.println();

        List<Number> nums = new ArrayList<>();
        nums.add(2);
        nums.add(2.2);
        nums.add(5L);
        nums.add(5);
        Number n = nums.get(0);

        System.out.println(n);
        System.out.println(nums.get(3));


/*        List<Cat> src = new ArrayList<>();
        src.add(new Cat());
        src.add(new Cat());
        src.add(new Cat());
        src.add(new Cat());
        src.add(new Cat());

        List<Pet> dest = new ArrayList<>();
        Collections.addAll(dest, src.get(0));

        for (Pet p : dest) {
            p.whoAmI();
            p.giveVoice();
        }*/
    }
}
