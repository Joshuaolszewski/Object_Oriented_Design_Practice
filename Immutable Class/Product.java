public final class Product
{
    private final String productName;
    private final String productDescription;
    private final double productPrice;
    private final int maxOrder; 
    
    public Product(String productName, String productDescription, double productPrice, int maxOrder)
    {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.maxOrder = maxOrder; 
    }
    
    public String getProductName()
    {
        return this.productName;
    }
    
    public String getProductDescription()
    {
        return this.productDescription;
    }
    
    public double getProductPrice()
    {
        return this.productPrice;
    }
    
    public int getMaxOrder()
    {
        return this.maxOrder;
    }
    
    public String toString()
    {
        return getProductName() + getProductDescription() + getProductPrice() + getMaxOrder();
    }
}