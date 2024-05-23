class Pen {
public static void main(String [] args){
String inkColor;
   public Pen(String type, String inkColor) { 
       this.inkColor = inkColor;
   }
}
}
class Pencil {
int pencilBrand;
public Pencil(String type, int pencilBrand) {
   this.pencilBrand = pencilBrand;
   }
public void sharpen() {
   System.out.println("Pencil is sharpened.");
   }
}
