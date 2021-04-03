public class Main {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        Observer traineeSpectator = new Trainee();
        trainer.addSpectator(traineeSpectator);

        Observable trainee = (Observable) traineeSpectator;

        Spectator firstSpectator = new Spectator("Maria");
        Spectator secondSpectator = new Spectator("Ivan");
        Spectator thirdSpectator = new Spectator("Georgi");
        trainee.addSpectator(firstSpectator);
        trainee.addSpectator(secondSpectator);
        trainee.addSpectator(thirdSpectator);

        trainer.setNewCommand("stand");
        trainer.setNewCommand("lay");

        trainee.removeSpectator(secondSpectator);

        trainer.setNewCommand("stand");
        trainer.setNewCommand("lay");
    }
}
