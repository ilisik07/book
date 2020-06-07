/**
 *
 * @author ilisik07
 */

public class kitaptest {
   public static void main(String[] args) {
 
      yazar mustafa = new yazar("Mustafa İLİŞİK", "ilisik_07@hotmail.com", 'm');
      System.out.println(mustafa);
      kitap java = new kitap("java öğrenme yardımcısı", mustafa, 9.99, 99);
      System.out.println(java);
     

      
      java.setPrice(8.88);
      java.setQty(88);
      System.out.println("isim: " + java.getName());
      
      System.out.println("fiyatı: " + java.getPrice());
      
      System.out.println("sayfa: " + java.getQty());
      
      System.out.println("yazar: " + java.getAuthor()); 
      
      System.out.println("yazarın ismi: " + java.getAuthor().getName());
     
      System.out.println("yazarın maili: " + java.getAuthor().getEmail());
 
      System.out.println("yazarın cinsiyeti: " + java.getAuthor().getGender());
    

      
      kitap dahajava = new kitap("java devam kitabı",
            new yazar("Mustafa İLİŞİK", "ilisik_07@hotmail.com", 'e'), 
            19.99, 8);
      System.out.println(dahajava);
      
   }
}
