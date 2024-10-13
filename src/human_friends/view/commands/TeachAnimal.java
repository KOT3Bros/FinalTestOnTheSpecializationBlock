package human_friends.view.commands;

import human_friends.view.ConsoleUI;

public class TeachAnimal extends Command {
    public TeachAnimal(ConsoleUI consoleUI) {
        super("Обучить животное новым командам", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().teachAnimal();
    }
}