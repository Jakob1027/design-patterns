package com.jakob.designpatterns.command;

public class RemoteLoader {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(garageDoor);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        Command[] partyOn = {livingRoomLightOnCommand, kitchenLightOnCommand, garageDoorOnCommand, ceilingFanHighCommand};
        Command[] partyOff = {livingRoomLightOffCommand, kitchenLightOffCommand, garageDoorOffCommand, ceilingFanOffCommand};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        RemoteControlWithUndo control = new RemoteControlWithUndo();

        control.setCommand(1, livingRoomLightOnCommand, livingRoomLightOffCommand);
        control.setCommand(2, kitchenLightOnCommand, kitchenLightOffCommand);
        control.setCommand(3, garageDoorOnCommand, garageDoorOffCommand);
        control.setCommand(4, ceilingFanHighCommand, ceilingFanOffCommand);
        control.setCommand(5, ceilingFanMediumCommand, ceilingFanOffCommand);
        control.setCommand(6, ceilingFanLowCommand, ceilingFanOffCommand);
        control.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(control);

        control.onButtonPushed(1);
        control.offButtonPushed(1);
        control.onButtonPushed(2);
        control.undoButtonPushed();
        control.offButtonPushed(2);
        control.onButtonPushed(3);
        control.undoButtonPushed();
        control.offButtonPushed(3);
        control.onButtonPushed(4);
        control.undoButtonPushed();
        control.offButtonPushed(4);
        control.onButtonPushed(5);
        control.offButtonPushed(5);
        control.undoButtonPushed();
        control.onButtonPushed(6);
        control.offButtonPushed(6);

        System.out.println("====== Party ======");
        control.onButtonPushed(0);
        control.offButtonPushed(0);
        control.undoButtonPushed();
    }
}
