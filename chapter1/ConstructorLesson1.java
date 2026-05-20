package chapter1;

public class ConstructorLesson1 {
    public static void main(String[] args) {
        Chick andoks = new Chick();
        Chick chooks = new Chick();
        Chick gannam = andoks;
        andoks.Chick();
    }

}

class Chick{ //🥚
    public Chick(){
        System.out.println("🐣 in constructor");
    }
    public void Chick(){
        System.out.println("🐥💬 I'm a method");
    }
}
