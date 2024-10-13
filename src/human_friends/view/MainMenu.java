package human_friends.view;

import human_friends.view.commands.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private List<Command> commands;

    public MainMenu(ConsoleUI consoleUI) {
        commands = new ArrayList<>();
        commands.add(new AddAnimal(consoleUI));
        commands.add(new GetAnimalCommands(consoleUI));
        commands.add(new TeachAnimal(consoleUI));
        commands.add(new SortByBirthDate(consoleUI));
        commands.add(new GetCountAnimals(consoleUI));
        commands.add(new Finish(consoleUI));
    }

    public String menu() {
        StringBuilder sb = new StringBuilder();
        sb.append("Меню:\n");
        for (int i = 0; i < commands.size(); i++) {
            sb.append(i + 1);
            sb.append(". ");
            sb.append(commands.get(i).getDescription());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void execute(int choice) {
        Command command = commands.get(choice - 1);
        command.execute();
    }
}
