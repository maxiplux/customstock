package models;

import utils.Observer;

import java.util.Iterator;
import java.util.Map;

public class StockBuyer implements Observer {

    //private AbstractMarket stockMarket;

    public void update(Map<String, Double> stocklist) {
        System.out.println("StockBuyer: stocklist is changed:");
        Iterator iter = stocklist.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String) entry.getKey();
            Double value = (Double) entry.getValue();
            System.out.println(key + " - $" + value);
        }
    }

    @Override
    public void notify(String change, Object source) {

    }

    @Override
    public void notify(String change, Map<String, Double> source) {

        System.out.println("StockBuyer: stocklist is changed: with Command"+change);
        Iterator iter = source.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String) entry.getKey();
            Double value = (Double) entry.getValue();
            System.out.println(key + " - $" + value);
        }
    }
}
