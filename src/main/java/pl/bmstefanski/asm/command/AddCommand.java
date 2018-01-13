package pl.bmstefanski.asm.command;

import pl.bmstefanski.asm.AnimalShelterManager;
import pl.bmstefanski.asm.api.basic.Animal;
import pl.bmstefanski.asm.basic.AnimalImpl;
import pl.bmstefanski.asm.basic.util.ShelterManager;
import pl.bmstefanski.asm.command.basic.Command;

import java.util.List;

public class AddCommand {

    private final AnimalShelterManager main;

    public AddCommand(AnimalShelterManager main) {
        this.main = main;
    }

    @Command(name = "add", description = "add new pet")
    private void add(List<String> args) {
        if (args.size() != 2) {
            System.out.println("Correct usage: !add <animal>");
            return;
        }

        System.out.println(main.getShelter().toString());

        Animal animal = new AnimalImpl(args.get(1));

        ShelterManager.addAnimal(animal, main.getShelter());
    }
}
