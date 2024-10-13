package human_friends.view.commands;

import human_friends.view.ConsoleUI;

public class AddAnimal extends Command {
    public AddAnimal(ConsoleUI consoleUI) {
        super("Добавить новое животное", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addAnimal();
    }
}
