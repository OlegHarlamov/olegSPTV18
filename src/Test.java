public class Test {

   public static void main(String args[]){
      //char grade = args[0].charAt(0);
      char grade = 'A';

      switch(grade)
      {
         case 'A' :
            System.out.println("Отлично!"); 
            break;
         case 'B' :
         case 'C' :
            System.out.println("Отлично выполнено");
            break;
         case 'D' :
            System.out.println("Вы прошли");
         case 'F' :
            System.out.println("Лучше попробуйте снова");
            break;
         default :
            System.out.println("Неверная оценка");
      }
      System.out.println("Ваша оценка " + grade);
   }
}