package lab14.com.patterns.command;

public class TestCommand {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Command shutDownCommand = new ShutDownCommand(computer);
        Command restartCommand = new RestartCommand(computer);

        Switch mySwitch = new Switch();
        mySwitch.storeAndExecute(restartCommand);
        mySwitch.storeAndExecute(shutDownCommand);
    }
}

//Computer is restarting...
//Computer is shutting down...