
package ddp;


class Controller 
{
   public void Start()
   {
      Drink d = new Tea();
      d = new Milk(d);
      d = new Sugar(d);

      System.out.println(d.getDescription() + "\n" + d.getPrice());      
   }
}
