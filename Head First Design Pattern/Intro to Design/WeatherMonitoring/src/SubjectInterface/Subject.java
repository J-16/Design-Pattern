package SubjectInterface;

import ObservableInterface.Observer;

public interface Subject extends Observer {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
