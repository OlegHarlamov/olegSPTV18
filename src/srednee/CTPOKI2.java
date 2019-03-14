package srednee;
public class CTPOKI2 {
    public static void main(String[] args) {
        String slovo = new String("java");
        String text = "Сьешь ещё этих французских булок и галет, да выпей же чаю с молоком, как и я.";
        String[] slova = text.split("");
        System.out.printf("Слов в тексте = %d%n", slova.length);
        String cc = "й"+"ц"+"у"+"к"+"е"+"н"+"г"+"ш"+"щ"+"з"+"х"+"ъ"+"ф"+"ы"+"в"+"а"+"п"+"р"+"о"+"л"+"д"+"ж"+"э"+"я"+"ч"+"с"+"м"+"и"+"т"+"ь"+"б"+"ю";
        for(String  w:slova){
        System.out.print(w+"; ");
        }
        System.out.println("\n------------");
        System.out.printf("Используем equalsIgnoreCase(%s,%s) =%s%n ", slovo, slova[0], slovo.equalsIgnoreCase (slova[0]));
        System.out.printf("Используем compareTo(%s,%s) =%s%n ", slovo, slova[0], slovo.compareTo (slova[0]));
    }
}
