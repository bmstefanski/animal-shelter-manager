package pl.bmstefanski.asm.command;

import pl.bmstefanski.asm.command.basic.Command;
import pl.bmstefanski.asm.database.MySQL;

import java.util.List;

public class SaveCommand {

    private final MySQL mySQL = MySQL.getInstance();

    @Command(name = "save", description = "save and exit")
    private void save(List<String> args) {
        mySQL.saveData();
        Runtime.getRuntime().exit(1);
    }
}