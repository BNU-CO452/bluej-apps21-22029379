
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * Narinder Kaur
 * @version 2021.11.18
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Apple MacBookPro"));
        stock.add(new Product(102, "Samsung Galaxy Book"));
        stock.add(new Product(103, "Microsoft Surface laptop4"));
        stock.add(new Product(104, "HP Spectre x360"));
        stock.add(new Product(105, "Dell XPS 13"));
        stock.add(new Product(106, "Razer Blade 14"));
        stock.add(new Product(107, "LG Gram 17"));
        stock.add(new Product(108, "Acer Swift 3"));
        stock.add(new Product(109, "Lenovo ThinkPadX1"));
        stock.add(new Product(110, "Google Pixelbook Go"));
        runDemo();
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101,4);
        stock.buyProduct(102,7);
        stock.buyProduct(103,25);
        stock.buyProduct(104,30);
        stock.buyProduct(105,37);
        stock.buyProduct(106,16);
        stock.buyProduct(107,6);
        stock.buyProduct(108,19);
        stock.buyProduct(109,33);
        stock.buyProduct(110,9);
    }

    private void sellProducts()
    {
        stock.sellProduct(101,2);
        stock.sellProduct(102,5);
        stock.sellProduct(103,20);
        stock.sellProduct(104,21);
        stock.sellProduct(105,30);
        stock.sellProduct(106,10);
        stock.sellProduct(107,10);
        stock.sellProduct(108,7);
        stock.sellProduct(109,15);
        stock.sellProduct(110,8);
        stock.sellProduct(111,11);
    }    
}