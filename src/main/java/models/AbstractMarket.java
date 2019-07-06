package models;

import utils.AbstractObservable;

import java.util.HashMap;
import java.util.Map;


public abstract class AbstractMarket extends AbstractObservable {
    Map<String, Double> stocklist = new HashMap<String, Double>();

    public Map<String, Double> getStocklist() {
        return stocklist;
    }
}

