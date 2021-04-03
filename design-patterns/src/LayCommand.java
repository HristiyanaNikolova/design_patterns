public class LayCommand extends Command {

    @Override
    public String getCommandName() {
        return "Lay down!";
    }

    @Override
    void execute() {
        System.out.println("Laying down.");
    }
}
