package pizaarestaurant;
public class Order {
    private int id;
    private Product prod;
    private String order_type;
    private boolean isCanceled;
    private double totalPrice;
    public Order(int id , String orderType,Product p){
        this.id=id;
        this.order_type=orderType;
        if(orderType.equals("Pizza"))
        {
            this.prod=new Pizza();
            prod.id=p.id;
            prod.name=p.name;
            prod.price=p.price;
            prod.quantity=p.quantity;   
            
        }
        else if(orderType.equals("Drink"))
        {
            this.prod=new Drink();
            prod.id=p.id;
            prod.name=p.name;
            prod.price=p.price;
            prod.quantity=p.quantity;   
        }
        this.isCanceled=false;
    }
    public Order()
    { 
        
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getOrderType()
    {
        return order_type;
    }
    public void setOrderType(String type)
    {
        order_type=type;
    }
    public double getTotalPrice()
    {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice)
    {
         this.totalPrice = totalPrice;
    }
    public void cancelOrder(Order order)
    {
        order.isCanceled=true;
    }
    public boolean getIsCanceled()
    {
        return isCanceled;
    }
    public String toString()
    {
        return "\t\tOrder Details:\n"
                +"ID: "+this.getId()+", Order Type: "+this.getOrderType()+", IsCanceled: "+this.getIsCanceled()
                +"\n"
                +"\t\tProduct Details"
                +prod.toString()
                +", Total Price: "+getTotalPrice()+"AED";
    }
}
