public class StandCommandFactory extends CommandFactory {

    @Override
    Command createCommand() {
        return new StandCommand();
    }
}
