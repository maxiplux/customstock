package models;

public class StockMarket extends AbstractMarket {


    public void addStock(String stockSymbol, Double price) {
        stocklist.put(stockSymbol, price);
        this.notifyAllObsesrver("AddStock", this.getStocklist());
    }

    public void update(String stockSymbol, Double price) {
        stocklist.put(stockSymbol, price);
        this.notifyAllObsesrver("updateStock", this.getStocklist());
    }
}
