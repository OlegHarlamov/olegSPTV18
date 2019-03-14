package srednee;

import java.util.Arrays;

public class Srednee {
    public static void main(String[] args) {
        int[] first =new int [5];
        int[] second =new int [5];
        for(int i=0;i<5;i++){
        first[i] = (int) (Math.random()*6);
        second[i] = (int) (Math.random()*6);
        }
        System.out.println("first "+Arrays.toString(first));
        System.out.println("second " +Arrays.toString(second));
        double save = 0;
        double save2 = 0;
        for (int i = 0; i<5; i++){
        save += first[i];
                save2 += second[i];
        }
        save  /=5;
        save2 /=5;
        if (save > save2){
        System.out.println("Среднее арифметическое первого массива ("+save2+") больше среднего.");
        }
        else if (save < save2)
            System.out.println("Среднее арифметическое первого массива ("+save+") меньше среднего арифметического второго массива ("+save2+")");
        else {
        System.out.println("Средние арифметические массивов равны ("+save+") = ("+save2+")");
        }
    }
    
}
