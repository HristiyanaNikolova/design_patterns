public class Spectator implements Observer {

    private String name;
    private Command exercise;
    private Observable trainee;

    public Spectator(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update() {
        if(this.trainee == null) {
            System.out.println(this.getName() + " has no trainee to spectate");
            return;
        }
        this.exercise = trainee.getUpdate();
        System.out.print(this.getName() + ": ");
        this.exercise.execute();
    }

    @Override
    public void setTrainer(Observable trainer) {
        this.trainee = trainer;
    }
}
