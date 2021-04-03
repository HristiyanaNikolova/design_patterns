public interface Observable {
    void addSpectator(Observer spectator);
    void removeSpectator(Observer spectator);
    void notifyObservers();
    Command getUpdate();
}
