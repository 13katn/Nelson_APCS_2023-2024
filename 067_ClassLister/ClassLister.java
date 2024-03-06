public class ClassLister{
public static void main(String[]args){
    String[] classes ={"math", "physics", "study hall", "philosophy", "lit", "comp sci"}; // array of classes
    System.out.println("this tri my classes are: "); // oytsdie the foreloop so it only prints once 
    for(int i=0; i<classes.length; i++){ // for loop that pritns the classes to only a certain amt of times like as muhc as the lengt so it dosnt repeat
        System.out.println(classes[i]);
    }
    }
}