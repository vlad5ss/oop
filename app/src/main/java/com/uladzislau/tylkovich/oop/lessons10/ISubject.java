package com.uladzislau.tylkovich.oop.lessons10;

/**
 * Created by mac on 8/6/17.
 */

public interface ISubject {

    public void registerObserver(IObserver o);
    public void removeObserver(IObserver o);
    public void  notifyObservers();
}
