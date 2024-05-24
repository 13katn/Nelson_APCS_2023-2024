public class Desk {
   public static void main(String[] args) {
       Pen pen = new Pen("ballpoint pen", "pink");
       Pencil pencil = new Pencil("mechanical", "grey");


       System.out.println(pen.inkColor);
       pen.click();
       System.out.println(pencil.leadType);
       pencil.sharpen();


   }
}


}
