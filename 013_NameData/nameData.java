public class nameData
{
    public static void main(String[] args){
        NameTransmogrifier foo = new NameTransmogrifier("kat nelson");
        System.out.println(foo.name);
        System.out.println(foo.nameReversed);
        System.out.println(foo.nameUpperCase);
        System.out.println(foo.nameLowerCase);
        System.out.println(foo.nameLength);
        System.out.println(foo.nameFirstLetter);
        System.out.println(foo.nameLastLetter);
    }
}