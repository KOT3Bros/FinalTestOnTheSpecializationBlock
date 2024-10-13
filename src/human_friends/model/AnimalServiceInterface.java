package human_friends.model;

import java.time.LocalDate;

public interface AnimalServiceInterface {
    void addAnimal(String name, LocalDate birthDate, int type);
    void getAnimalCommands(String name);
    void teachAnimal(String name, String command);
    void sortByBirthDate();
    void getCountAnimals();
}
