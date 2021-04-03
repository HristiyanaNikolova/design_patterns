public class StandCommand extends Command {

    @Override
    public String getCommandName() {
        return "Stand up!";
    }

    @Override
    void execute() {
        System.out.println("Staying up.");
    }
}