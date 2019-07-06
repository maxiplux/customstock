package models;

import utils.Observer;

import java.util.Iterator;
import java.util.Map;

public class StockViewer implements Observer {
    private AbstractMarket stockMarket;

    public void update(Map<String, Double> stocklist) {
        System.out.println("StockViewer: stocklist is changed:");
        Iterator iter = stocklist.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String) entry.getKey();
            Double value = (Double) entry.getValue();
            System.out.println("StockViewer" + key + " - $" + value);
        }
    }

    @Override
    public void notify(String change, Object source) {

    }

    @Override
    public void notify(String change, Map<String, Double> source) {
        System.out.println("StockViewer: stocklist is changed:" +change);
        Iterator iter = source.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String) entry.getKey();
            Double value = (Double) entry.getValue();
            System.out.println("StockViewer" + key + " - $" + value);
        }

    }
}