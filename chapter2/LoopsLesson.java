package chapter2;

import java.util.Scanner;

public class LoopsLesson {
    public static void main(String[] args) {
        byte a = 1;
        while(a<=10)
            System.out.println("a = "+a++);
        do
            System.out.println("do while : a = "+a--);
        while (a<10);

        System.out.println("end of program");
        int b = 0;
        boolean bol = true;
        for( ;b<10;b++)
            System.out.println("b = "+b++);

        System.out.println("enter a valid number");
        Scanner q = new Scanner(System.in);
        int limit = q.nextInt();
        for(byte x=1;x<=limit;x++){
            if(limit>127) break;
            for(int y=1;y<=x;y++){
                
                System.out.print(x);
            }
            System.out.println();
            
        }
        // for(int qq = intSample1();true;qq=1,System.out.println(qq=21),qq=0){
        //         //     System.out.println();
                // }
                        String[] colors ={"black","red","pink","yellow","white","blue","violet"}; 
        for(String color: colors)
            System.out.println("Color: "+color);
        //
ROW_TABLE:        for(int i = 1;i<=10;i++){
COL_TABLE:            for(int y = 1;y<=10;y++){
                        if(y==5)
                            continue COL_TABLE; //break COL_TABLE;
                        System.out.print(y*i+"\t");

            }
            System.out.println();
        }
        System.out.println(
            //(booleanExp)? "true": "false"
            ((limit%2)==0)?((limit%3)==0)?"fizz":"buzz":((limit<100)?"low":"high")
        );
    }
}
