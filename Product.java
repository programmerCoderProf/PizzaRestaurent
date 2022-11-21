
package pizaarestaurant;

public abstract class Product {
    protected int id;
    protected String name;
    protected double price;
    protected int quantity;
    public Product(int id,String  n,double price , int qty)
    {
        this.id=id;
        name=n;
        this.price=price;
    }
    public Product(){}
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setID(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(int qty)
    {
        this.quantity=qty;
    }
    public abstract void printType();
    public String toString()
    {
        return "\nID:"+this.getId()+", Name:"+this.getName()+", The price of one item:"+this.getPrice()
                +"AED,Quantity:"+this.getQuantity();
    }
    public void update(String name , double price , int qty )
    {
        this.name=name;
        if(price>=0 && quantity>=0)
        {
            this.price=price;
            quantity=qty;
        }else{
            System.out.println("Price and quantity must be positive!");
        }
    }
}
