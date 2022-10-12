package hw;

public class Main {

    public static void main(String[] args) {
        Author dostaevsky = new Author("Федор", "Достаевский");
        Book idiot = new Book("Идиот", dostaevsky, 1868);

        Author griboedov = new Author("Александр", "Грибоедов");
        Book woeFromWit = new Book("Горе от ума", griboedov, 1833);
        Book woeFromWit2 = new Book("Горе от ума", griboedov, 1833);;

        System.out.println("Название книги: " + idiot.getTitle()
                + " Автор: " + dostaevsky.getName() + " " + dostaevsky.getSurname()
                + " Год издания:" + idiot.getPublicationYear());
        System.out.println("Название книги: " + woeFromWit.getTitle()
                + " Автор: " + woeFromWit.getAuthor().getName() + " " + woeFromWit.getAuthor().getSurname()
                + " Год издания:" + woeFromWit.getPublicationYear());

        idiot.setPublicationYear(1990);
        System.out.println("Idiot = " + idiot.getPublicationYear());

        System.out.println(woeFromWit.toString());

        System.out.println(woeFromWit.equals(woeFromWit2));
    }
}