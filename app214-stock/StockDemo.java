import java.util.Random;

/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * Modified by Narinder Kaur
 * @version 17/11/2021
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    private Random random;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)

    {
            this.stock= stock;
            this.random= new Random();
        
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
    /**
     * Method prints stock being bought and sold 
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
    /**
     * Method of buy products from stock
     */
    
    private void buyProducts()
    {
        // randomises the amount of items bought
        for (int productID = 101; productID <=110; productID++)
        stock.buyProduct(productID, random.nextInt(11));
    }
    /**
     * method to sell products from stock
     */
    private void sellProducts()
    {
        // randomises the amount of items sold
       for (int productID = 101; productID <=110; productID++)
        stock.sellProduct(productID, random.nextInt(11));
    }    
}