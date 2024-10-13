package human_friends.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> commands;

    public Animal(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    @Override
    public String toString() {
        return name + " (родился: " + birthDate + ")";
    }
}
