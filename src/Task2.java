import java.util.Arrays;

public class Task2 {
    private static final Book[] book = new Book[2];

    public static void main(String[] args) {
        book[0] = new Book("Евгений Онегин", "А.С. Пушкин");
        book[1] = new Book("Идиот", "Ф.М. Достоевский");
        for (Book books : book) {
            System.out.println(Arrays.toString(new Book[]{books}));
        }
    }
}
