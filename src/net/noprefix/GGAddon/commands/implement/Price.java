package net.noprefix.GGAddon.commands.implement;

import net.noprefix.GGAddon.GGAddon;
import net.noprefix.GGAddon.commands.GCommand;

public class Price extends GCommand {
    public Price(String name, String description, String germanDescription) {
        super(name, description, germanDescription);
    }

    @Override
    public void execute(String[] args) {
        GGAddon.getInstance().getChat().sendMessage("§cDer Grieferwert Support folgt in der nächsten Version!");
    }
}
