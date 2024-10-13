package human_friends.view.commands;

import human_friends.view.ConsoleUI;

public class GetCountAnimals extends Command {
    public GetCountAnimals(ConsoleUI consoleUI) {
        super("Вывести общее количество животных", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().getCountAnimals();
    }
}