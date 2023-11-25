package N3Ejercicio1.Command;

public class Invoker {

    private Command arrancarCommand;
    private Command acelerarCommand;
    private Command frenarCommand;

    // Constructor (opcional)
    public Invoker() {
        /*Podría crear un constructor si necesitara inicializar el Invoker con comandos predeterminados,
        pero en este caso, no es estrictamente necesario.*/
    }

    public void setArrancarCommand(Command command) {

        arrancarCommand = command;
    }

    public void setAcelerarCommand(Command command) {

        acelerarCommand = command;
    }

    public void setFrenarCommand(Command command) {

        frenarCommand = command;
    }

    public void arrancar() {
        if (arrancarCommand != null) {
            arrancarCommand.execute();
        }
    }

    public void acelerar() {
        if (acelerarCommand != null) {
            acelerarCommand.execute();
        }
    }

    public void frenar() {
        if (frenarCommand != null) {
            frenarCommand.execute();
        }
    }

}
