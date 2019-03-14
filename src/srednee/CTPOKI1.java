package srednee;
public class CTPOKI1 {
    public static void main(String[] args) {
        char[] chars = {'Г','р','у','п','п','а',' ', 'S', 'P', 'T', 'V', '1', '8'};
        String s1 = "Строки";
        System.out.println("Строка s до CopyValueOf: " +s1);
    s1 = s1.copyValueOf(chars);
    System.out.println("Строка ss псоле copyValueOf: " +s1);
    
    System.out.println();
    
    String s2 = s1.copyValueOf(chars);
    String s3 = s1.copyValueOf(chars, 7, 6);
    System.out.println("Строка без смещения: " +s2);
    System.out.println("Строка со смещением 2 и длинной 7: " +s3);
    }
}
