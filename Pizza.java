
package pizaarestaurant;

public class Pizza extends Product{
     private String description; 
    public Pizza(int id, String n, double price, int qty,String desc) {
        super(id, n, price, qty);
        description=desc;
    }
  public Pizza (){}
  public String getDescription()
  {
      return description;
  }
  public void setdescription (String desc)
  {
      description =desc;
  }
    @Override
    public void printType() {
        
        System.out.println("Pizza");
    }
    public String toString()
    {
        
        String d=this.getDescription()!=null?", Description:"+this.getDescription()+"\n":"";
        return super.toString()+d;
    }
}
