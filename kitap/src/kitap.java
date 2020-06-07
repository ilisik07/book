/**
 *
 * @author ilisik07
 */
public class kitap extends yazartest{

   private String name;
   private yazar author;
   private double price;
   private int qty;

   public kitap(String name, yazar author, double price, int qty) {
      this.name = name;
      this.author = author;
      this.price = price;
      this.qty = qty;
   }
 
   public String getName() {
      return name;
   }
   
   public yazar getAuthor() {
      return author; 
   }
   
   public double getPrice() {
      return price;
   }
   
   public void setPrice(double price) {
      this.price = price;
   }

   public int getQty() {
      return qty;
   }

   public void setQty(int qty) {
      this.qty = qty;
   }
 
 
   public String toString() {
      return "'" + name + " bay " + author;  
   }
}
