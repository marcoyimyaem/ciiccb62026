package chapter1;

public class ObjectsLifecycleLesson {
    
    public static void main(String[] args) {
        House2 h1 = new House2();
        House2 h2 = new House2();
        House2 h3= h1;
        h1.block = 41;
        h1.lot = 3;
        h3.family = "De Guzman's";
        System.out.println(h1.block);
        h1=null;
        h1=h2;
        h1=h3;
        h3=null;
        h1=null;
        h2=null;
        h1=new House2();
        House2 h4 = new House2();
        h4.objectMethodSample();
        System.out.println("endofprogram");
    }
}

class House2{
    int block;
    int lot;
    String family;
    void objectMethodSample(){
        House2 h4 = new House2();
        h4.block = 2;
        h4.lot = 6;
        h4.family = "Co's";
        System.out.println(h4.family);
        
    }
}
