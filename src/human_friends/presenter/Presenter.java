package human_friends.presenter;

import human_friends.model.AnimalService;
import human_friends.view.View;

import java.time.LocalDate;

public class Presenter {
    private View view;
    private AnimalService service;

    public Presenter(View view) {
        this.view = view;
        service = new AnimalService();
    }

    public void addAnimal(String name, LocalDate birthDate, int type) {
        service.addAnimal(name, birthDate, type);
    }

    public void getAnimalCommands(String name) {
        service.getAnimalCommands(name);
    }

    public void teachAnimal(String name, String command) {
        service.teachAnimal(name, command);
    }

    public void sortByBirthDate() {
        service.sortByBirthDate();
    }

    public void getCountAnimals() {
        service.getCountAnimals();
    }
}
