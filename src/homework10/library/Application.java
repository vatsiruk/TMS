package homework10.library;

import homework10.library.models.Book;
import homework10.library.models.Library;

import java.util.*;

public class Application {
    private Scanner scanner;
    private Library library;

    public Application() {
        scanner = new Scanner(System.in);
        library = new Library();
    }

    public void start() {
        addBooksInLibrary();

        while (true) {
            printSeparator();

            System.out.println("    Выберите действие:\n" +
                    "1 - Вывод всех книг\n" +
                    "2 - Добавление книги\n" +
                    "3 - Удаление книги\n" +
                    "4 - Редактирование книги\n" +
                    "0 - Выход из приложения"
            );

            chooseActionInMainMenu();
        }
    }

    private void addBooksInLibrary() {
        library.addBook(new Book(1, "Гарри Поттер и Философский камень", "фентези"));
        library.addBook(new Book(2, "Гарри Поттер и Тайная комната", "фентези"));
        library.addBook(new Book(3, "Гарри Поттер и Узник Азкабана", "фентези"));
        library.addBook(new Book(4, "Гарри Поттер и Кубок Огня", "фентези"));
        library.addBook(new Book(5, "Гарри Поттер и Орден Феникса", "фентези"));
        library.addBook(new Book(6, "Гарри Поттер и Принц-Полукровка", "фентези"));
        library.addBook(new Book(7, "Гарри Поттер и Дары Смерти", "фентези"));
        library.addBook(new Book(8, "Приключения Шерлока Холмса", "детектив"));
        library.addBook(new Book(9, "Маленький принц", "сказка"));
        library.addBook(new Book(10, "Игра престолов", "фентези"));
        library.addBook(new Book(11, "Властелин колец: Братство кольца", "фентези"));
        library.addBook(new Book(12, "Властелин колец: Две твердыни", "фентези"));
        library.addBook(new Book(13, "Властелин колец: Возвращение короля", "фентези"));
    }

    private void chooseActionInMainMenu() {
        switch (scanner.next()) {
            case "1":
                launchMenuForPrintingBooksList();
                break;
            case "2":
                launchMenuForAddingBook();
                break;
            case "3":
                launchMenuForRemovingBook();
                break;
            case "4":
                launchMenuForEditingBook();
                break;
            case "0":
                scanner.close();
                System.exit(0);
                break;
            default:
                System.err.println("Введено неверное значение. Повторите попытку...");
                chooseActionInMainMenu();
                break;
        }
    }

    private void launchMenuForPrintingBooksList() {
        printSeparator();

        System.out.println("    Выберите как вывести список книг:\n" +
                "1 - по алфавиту (возрастание)\n" +
                "2 - по алфавиту (убывание)\n" +
                "3 - по добавлению(сначала новые, потом более старые)\n" +
                "0 - Выход из приложения\n"
        );

        switch (scanner.next()) {
            case "1":
                System.out.println(getListByTitleInAlphabetOrder(library.getBooksList()));
                break;
            case "2":
                System.out.println(getListByTitleAgainstInAlphabetOrder(library.getBooksList()));
                break;
            case "3":
                System.out.println(getListByOrderOfAdding(library.getBooksList()));
                break;
            case "0":
                scanner.close();
                System.exit(0);
                break;
            default:
                System.err.println("Введено неверное значение. Повторите попытку...");
                launchMenuForPrintingBooksList();
                break;
        }
    }

    private void launchMenuForAddingBook() {
        printSeparator();
        System.out.print("Введите id книги: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Введите id книги: ");
            scanner.next();
        }
        int id = scanner.nextInt();
        System.out.print("Введите название книги: ");
        String title = scanner.next();

        System.out.print("Введите жанр книги: ");
        String genre = scanner.next().toLowerCase();

        library.addBook(new Book(id, title, genre));
    }


    private void launchMenuForRemovingBook() {
        printSeparator();

        System.out.print("Введите id книги, которую хотите удалить: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Введите id книги, которую хотите удалить: ");
            scanner.next();
        }

        library.removeBook(scanner.nextInt());
    }

    private void launchMenuForEditingBook() {
        System.out.print("Введите id книги, которую хотите отредактировать: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Введите id книги, которую хотите отредактировать: ");
            scanner.next();
        }
        int id = scanner.nextInt();

        System.out.print("Введите новое название книги: ");
        String newTitle = scanner.next();

        System.out.print("Введите новый жанр книги: ");
        String newGenre = scanner.next().toLowerCase();

        library.editBook(id, newTitle, newGenre);
    }

    private List<Book> getListByTitleInAlphabetOrder(List<Book> list) {
        List<Book> newList = new ArrayList<>();
        newList.addAll(list);

        Collections.sort(newList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        return newList;
    }

    private List<Book> getListByTitleAgainstInAlphabetOrder(List<Book> list) {
        List<Book> newList = new ArrayList<>();
        newList.addAll(getListByTitleInAlphabetOrder(list));

        Collections.reverse(newList);

        return newList;
    }

    private List<Book> getListByOrderOfAdding(List<Book> list) {
        List<Book> newList = new ArrayList<>();
        newList.addAll(list);

        Collections.reverse(newList);

        return newList;
    }

    private void printSeparator() {
        System.out.println("----------------------------------");
    }
}
