package org.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class TeddyBearStock implements ISubject {
    int teddy;
    boolean isStockAvailable;
    private List<IObserver> observers;

    public TeddyBearStock() {
        observers = new ArrayList<>();
        teddy = 0;
        isStockAvailable = false;
    }
    public void setStockAvailable(boolean stockAvailable) {
        isStockAvailable = stockAvailable;
        if(isStockAvailable) {
            notifyObservers();
        }
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.stream().forEach(observer -> observer.update(teddy));
    }

    public boolean isStockAvailable() {
        return isStockAvailable;
    }

    public int getTeddy() {
        return teddy;
    }

    public void setTeddy(int teddy) {
        this.teddy = teddy;
        if(this.teddy>0) {
            setStockAvailable(true);
        }
    }
}
