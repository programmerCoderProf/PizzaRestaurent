
package pizaarestaurant;

public class Drink extends Product{
    private int fill;
    public Drink(int id, String n, double price, int qty,int fill) {
        super(id, n, price, qty);
        this.fill=fill;
    }
    public Drink()
    {
        
    }
    public int getFill()
    {
        return fill;
    }
    public void setFill(int fill)
    {
        if(fill>0)
        {
            this.fill=fill;
        }
        else{
            System.out.println("Fill must be positive");
        }
    }
    @Override
    public void printType() {
        System.out.println("Drink");
    }
    public String toString()
    {
         String d=this.getFill()!=0?", Fill:"+this.getFill()+"L\n":"";
         return super.toString()+d;
       
    }
}
