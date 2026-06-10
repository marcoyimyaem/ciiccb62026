package chapter4;

public class ConstructorLesson {
    public static void main(String[] args) {
        Bunny bunny1 = new Bunny("Bugs");
        Bunny bunny2 = new Bunny("Lola");
    }
}
class Bunny{
    String name;
    public Bunny(String name){
        this.name = name;
        System.out.println("this is Bunny Constructor");
    }
    
}