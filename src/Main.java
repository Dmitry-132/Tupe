//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author bigSmoke = new Author("большой", "дым");
        Author marx = new Author("Karl","Marx");
        Book ballas = new Book("iAmBallas", 1992, bigSmoke);
        Book capital = new Book("capital",1867,marx);
        System.out.println(ballas);
        System.out.println(capital);
        capital.setPublication(1910);
        System.out.println(capital);

    }
}