import models.StockBuyer;
import models.StockMarket;
import models.StockViewer;

public class Application {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        StockBuyer buyer = new StockBuyer();
        StockViewer viewer = new StockViewer();

        market.addObserver(buyer);
        market.addObserver(viewer);

        market.addStock("ORC", 12.23);
        market.addStock("MSC", 45.78);

        market.update("ORC", 12.34);
        market.update("MSC", 44.68);
    }

}
