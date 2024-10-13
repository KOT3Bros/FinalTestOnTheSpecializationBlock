package human_friends.view.commands;

import human_friends.view.ConsoleUI;

public class Finish extends Command {
    public Finish(ConsoleUI consoleUI) {
        super("Закончить работу", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().finish();
    }
}
