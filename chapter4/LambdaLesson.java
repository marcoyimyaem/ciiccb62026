package chapter4;

import java.util.ArrayList;
import java.util.List;

public class LambdaLesson {
    static void print(List<Animal> animals, CheckTrait checker){
        for(Animal animal:animals){
            if(checker.test(animal)) System.out.print(animal+", ");
        
        }
        System.out.println();

    }
    public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>();
    animals.add(new Animal("fish", false, true));
    animals.add(new Animal("kangaroo", true, false));
    animals.add(new Animal("rabbit", true, false));
    animals.add(new Animal("turtle", false, true));
    // print(animals, new CheckIfHopper());
    // System.out.println("check if swimmer");
    // print(animals, new CheckIfSwimmer());
    System.out.println("can hop lambda");
    print(animals, a->a.canHop());
    System.out.println("can swim lambda");
    print(animals, a->a.canSwim());

}
}

class Animal{
    String spicies;
    boolean canHop;
    boolean canSwim;

    public Animal(String spicies, boolean canHop, boolean canSwim){
        this.spicies=spicies;
        this.canHop=canHop;
        this.canSwim=canSwim;
    }
    boolean canHop(){
        return canHop;
    }
    boolean canSwim(){
        return canSwim;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return spicies;
    }
}
interface CheckTrait {
    boolean test(Animal a);
}
// class CheckIfHopper implements CheckTrait{

//     @Override
//     public boolean test(Animal a) {
//         return a.canHop();    
//     }

// }
// class CheckIfSwimmer implements CheckTrait{

//     @Override
//     public boolean test(Animal a) {
//         return a.canSwim();    
//     }

// }