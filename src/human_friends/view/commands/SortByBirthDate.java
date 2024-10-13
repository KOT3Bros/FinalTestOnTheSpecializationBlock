package human_friends.view.commands;

import human_friends.view.ConsoleUI;

public class SortByBirthDate extends Command {
    public SortByBirthDate(ConsoleUI consoleUI) {
        super("Вывести список животных по дате рождения", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().sortByBirthDate();
    }
}