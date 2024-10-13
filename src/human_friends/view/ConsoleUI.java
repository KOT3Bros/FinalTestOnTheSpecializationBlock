package human_friends.view;

import human_friends.presenter.Presenter;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConsoleUI implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new MainMenu(this);
    }

    @Override
    public void start() {
        while (work) {
            System.out.println(menu.menu());
            String strChoice = scanner.nextLine();
            int choice = Integer.parseInt(strChoice);
            menu.execute(choice);
        }
    }

    public void addAnimal() {
        System.out.println("Введите имя животного: ");
        String name = scanner.nextLine();

        LocalDate birthDate = null;

        while (true) {
            System.out.println("Введите дату рождения в формате гггг-ММ-дд");
            String strBirthDate = scanner.nextLine();

            try {
                birthDate = LocalDate.parse(strBirthDate, DateTimeFormatter.ISO_LOCAL_DATE);
                break;
            } catch (DateTimeException e) {
                System.out.println("Неверный формат даты. Пожалуйста, введите дату в формате гггг-ММ-дд.");
            }
        }

        System.out.println("Выберите тип животного: 1. Собака 2. Кошка 3. Хомяк 4. Лошадь 5. Верблюд 6. Осел");
        int type = scanner.nextInt();
        scanner.nextLine();

        presenter.addAnimal(name, birthDate, type);
    }

    public void getAnimalCommands() {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        presenter.getAnimalCommands(name);
    }

    public void teachAnimal() {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();
        System.out.print("Введите новую команду: ");
        String command = scanner.nextLine();

        presenter.teachAnimal(name, command);
    }

    public void sortByBirthDate() {
        presenter.sortByBirthDate();
    }

    public void getCountAnimals() {
        presenter.getCountAnimals();
    }

    public void finish() {
        System.out.println("До новых встреч!");
        work = false;
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
}
