package srednee;

import java.util.Arrays;

public class Zadanie {
    public static void main(String[] args) {
        int[] mass = new int [20];
        for (int i=0;i<20;i++){
        int a = (int) (Math.random()*100+1);
        if (a %2==0){
        mass[i] = a;
        }
        else {
        mass[i] = a+1;
        }               
        }
        int count = mass.length;
        System.out.println("Массив из 20-ти случайных чисел = " +Arrays.toString(mass) +"/n");
        System.out.println("Длинна массива: " +count);
        int max = mass[0];
        int min = mass[count-1];
        
            System.out.println("Минимальное значение: " +max);
    System.out.println("Минимально значение: "+min);
    }
}
