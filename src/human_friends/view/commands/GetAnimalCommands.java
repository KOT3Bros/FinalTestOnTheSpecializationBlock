package human_friends.view.commands;

import human_friends.view.ConsoleUI;

public class GetAnimalCommands extends Command {
    public GetAnimalCommands(ConsoleUI consoleUI) {
        super("Вывести список команд животного", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().getAnimalCommands();
    }
}