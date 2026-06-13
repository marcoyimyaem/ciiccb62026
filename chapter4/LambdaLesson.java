package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaLesson {
    static void print(List<Animal> animals, Predicate<Animal> checker){
        for(Animal animal:animals){
            if(checker.test(animal)) System.out.print(animal+", ");
        
        }
        System.out.println();

    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true,1));
        animals.add(new Animal("kangaroo", true, false,5));
        animals.add(new Animal("rabbit", true, false,2));
        animals.add(new Animal("turtle", false, true,56));
        animals.add(new Animal("camel", false, false,12));
        animals.add(new Animal("frog", true, true,1));
        animals.add(new Animal("dog", true, true,7));
        // print(animals, new CheckIfHopper());
        // System.out.println("check if swimmer");
        // print(animals, new CheckIfSwimmer());
        System.out.println("can hop lambda");
        print(animals, a->a.canHop());
        System.out.println("can swim lambda");
        print(animals, a->a.canSwim());
        print(animals, a->!a.canSwim()&& !a.canHop());
        print(animals, a->a.canSwim()&& a.canHop());
        print(animals, a->a.age>5);
        TwoNumberOps addTwoNums = (a,b,c)-> a*b+1000/6;
        TwoNumberOps mulTwoNums = (p,o,l)-> p*p+o;
        System.out.println(addTwoNums.aOpsB(6, 7,true));
        System.out.println(mulTwoNums.aOpsB(6,9, false));
        DiscountItem tenPercent = (a)-> a-(a*0.10);
        DiscountItem twentyPercent = (a)-> a-(a*0.20);
        DiscountItem fiftyPercent = (a)-> a-(a*0.50);
        double price = 1000;
        System.out.println(tenPercent.dc(price));
        System.out.println(twentyPercent.dc(price));
        System.out.println(fiftyPercent.dc(price));
}
}

class Animal{
    String spicies;
    boolean canHop;
    boolean canSwim;
    int age;
    public Animal(String spicies, boolean canHop, boolean canSwim, int age){
        this.spicies=spicies;
        this.canHop=canHop;
        this.canSwim=canSwim;
        this.age= age;
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
// interface CheckTrait {
//     boolean test(Animal a);
// }
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
interface TwoNumberOps{
    float aOpsB(float a, float b,boolean c);
}

interface DiscountItem{
    double dc(double b);
}