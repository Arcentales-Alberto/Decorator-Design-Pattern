
package ddp;


public class Milk extends Condiment
{
    public Milk(Drink drink) { this.drink = drink;}

    @Override
    public Double getPrice(){ return drink.getPrice() + 23.2; }

    @Override
    public String getDescription() { return drink.getDescription() + "with milk"; }
}
