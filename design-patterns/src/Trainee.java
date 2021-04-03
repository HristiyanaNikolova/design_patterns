import java.util.ArrayList;
import java.util.List;

public class Trainee implements Observable, Observer {
    private Command exercise;
    private Observable trainer;
    private List<Observer> observers;

    public Trainee() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addSpectator(Observer spectator) {
        this.observers.add(spectator);
        spectator.setTrainer(this);
    }

    @Override
    public void removeSpectator(Observer spectator) {
        if(observers.isEmpty() || !observers.contains(spectator)){
            return;
        }
        this.observers.remove(spectator);
    }

    @Override
    public void notifyObservers() {
        for(Observer spectator: this.observers) {
            spectator.update();
        }
    }

    @Override
    public Command getUpdate() {
        return this.exercise;
    }

    @Override
    public void update() {
        if(trainer != null) {
            this.exercise = trainer.getUpdate();
            System.out.print("Trainee: ");
            this.exercise.execute();
            this.notifyObservers();
        }
    }

    public void setTrainer(Observable trainer) {
        this.trainer = trainer;
    }
}