
public class Trainer implements Observable{
    private Observer trainee;
    private Command currentCommand;
    private StandCommandFactory standCommandFactory;
    private LayCommandFactory layCommandFactory;

    public Trainer() {
        this.standCommandFactory = new StandCommandFactory();
        this.layCommandFactory = new LayCommandFactory();
    }

    public void setNewCommand(String command) {
        if (command.equalsIgnoreCase("stand")) {
            this.currentCommand = standCommandFactory.createCommand();
        } else {
            this.currentCommand = layCommandFactory.createCommand();
        }
        System.out.println(this.currentCommand.getCommandName());
        notifyObservers();
    }

    @Override
    public void addSpectator(Observer trainee) {
        this.trainee = trainee;
        trainee.setTrainer(this);
    }

    @Override
    public void removeSpectator(Observer trainee) {
        if(trainee != null){
            this.trainee = null;
        }
    }

    @Override
    public void notifyObservers() {
        this.trainee.update();
    }

    @Override
    public Command getUpdate() {
        return this.currentCommand;
    }
}
