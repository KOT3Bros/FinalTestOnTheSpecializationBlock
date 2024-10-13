package human_friends.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalService implements AnimalServiceInterface {
    private List<Animal> animals = new ArrayList<>();
    private int animalCount = 0;

    @Override
    public void addAnimal(String name, LocalDate birthDate, int type) {
        Animal animal = null;
        switch (type) {
            case 1:
                animal = new Dog(name, birthDate);
                break;
            case 2:
                animal = new Cat(name, birthDate);
                break;
            case 3:
                animal = new Hamster(name, birthDate);
                break;
            case 4:
                animal = new Horse(name, birthDate);
                break;
            case 5:
                animal = new Camel(name, birthDate);
                break;
            case 6:
                animal = new Donkey(name, birthDate);
                break;
            default:
                System.out.println("Неверный тип животного.");
                return;
        }
        animals.add(animal);
        animalCount++;
        System.out.println("Животное добавлено: " + animal);
    }

    public void getAnimalCommands(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                System.out.println("Команды для " + name + ": " + animal.getCommands());
                return;
            }
        }
        System.out.println("Животное не найдено.");
    }

    public void teachAnimal(String name, String command) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                animal.addCommand(command);
                System.out.println(name + " теперь знает новую команду: " + command);
                return;
            }
        }
        System.out.println("Животное не найдено.");
    }

    public void sortByBirthDate() {
        animals.sort(Comparator.comparing(Animal::getBirthDate));
        System.out.println("Список животных по дате рождения:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void getCountAnimals() {
        System.out.println("Общее количество животных: " + animalCount);
    }
}
