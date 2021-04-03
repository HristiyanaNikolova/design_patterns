public class LayCommandFactory extends CommandFactory {

    @Override
    Command createCommand() {
        return new LayCommand();
    }
}
