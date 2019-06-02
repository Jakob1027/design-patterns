package com.jakob.designpatterns.command;

public class GarageDoorOffCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.close();
    }

    @Override
    public void undo() {
        garageDoor.open();
    }
}
