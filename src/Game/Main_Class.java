package Game;

import java.util.Random;
import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Random randnum = new Random();
int rand = randnum.nextInt(3)+1;
        System.out.print("Комната номер: "+rand);
        if(rand == 1){
System.out.println(", это лёгкий Босс!");
System.out.println("Сбежать - 5 || Сражаться - 6");
}
        if(rand == 2){
System.out.println(", это сундук!");
System.out.println("Press F to leave!");
}
        if(rand == 3){
System.out.println(", это сложный Босс!");
System.out.println("Сбежать - 5 || Сражаться - 6");
        }
        
        String otv = scn.nextLine();
        System.out.println(otv);
        switch(otv){
            case "5":
                System.out.println("Вы убежали!");
            System.exit(0);
            case "6":
                System.out.println("Сражение началось!");
                break;
            case "F":
                System.out.println("Вы победили!");
                break;
            default:
                System.out.println("Вы ввели неверное число!");
        }
        Monster1[] monsterArray = {new Monster1(),
        new Monster1()
        };
        Monster2[] monster2Array = {new Monster2(),
        new Monster2()
        };
        Human[] humanArray = {new Human(),
        new Human()
        };
        int hd = humanArray[0].damage;
        int bd = monsterArray[0].damageM1;
        int bd2 = monster2Array[0].damageM2;
                if (rand == 1){
                    System.out.println("Человек: " +humanArray[0].name +" ||| Урон: "+humanArray[0].damage);
                    System.out.println("Босс: "+monsterArray[0].name+" ||| Урон: "+monsterArray[0].damageM1);
                    if(hd>bd){
                    System.out.println("Ты выиграл!");
                    }else if(hd<bd){
                    System.out.println("Ты проиграл!");
                    }
        }
                
                
          
                if (rand == 3){
                    System.out.println("Человек: " +humanArray[0].name +" ||| Урон: "+humanArray[0].damage);
                    System.out.println("Босс: "+monster2Array[0].name+" ||| Урон: "+monster2Array[0].damageM2);               
        if(hd>bd2){
                    System.out.println("Ты выиграл!");
                    }else if(hd<bd2){
                    System.out.println("Ты проиграл!");
                    }
                }
                 
    }
}
    