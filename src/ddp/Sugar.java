
package ddp;


public class Sugar extends Condiment
{
    public Sugar(Drink drink) { this.drink = drink; }
    
    @Override
    public Double getPrice() { return drink.getPrice() + 23.23;  }

    @Override
    public String getDescription() { return drink.getDescription() + " with Sugar"; }
    
    
}
