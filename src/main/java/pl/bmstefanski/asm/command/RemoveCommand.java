package pl.bmstefanski.asm.command;

import pl.bmstefanski.asm.api.basic.Animal;
import pl.bmstefanski.asm.basic.AnimalImpl;
import pl.bmstefanski.asm.basic.manager.AnimalManager;
import pl.bmstefanski.asm.command.basic.Command;

import java.util.List;

public class RemoveCommand {

    @Command(name = "remove", description = "remove pet")
    private void remove(List<String> args) {
        if (args.size() != 2) {
            System.out.println("Correct usage: !remove <animal>");
            return;
        }

        Animal animal = new AnimalImpl(args.get(1));

        AnimalManager.removeAnimal(animal);
    }
}
