/**
 *
 * @author ilisi
 */

public class yazartest {
   public static void main(String[] args) {
      yazar yzr = new yazar("Mustafa İLİŞİK", "letsgo2705@gmail.com", 'e');
      System.out.println(yzr);
      yzr.setEmail("letsgo2705@gmail.com");
      System.out.println(yzr);
      System.out.println("adı: " + yzr.getName());
      System.out.println("cinsiyeti: " + yzr.getGender());
      System.out.println("maili: " + yzr.getEmail());
   }
}
