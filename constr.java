/*class constr{
 public static void main(String [] args){

    System.out.println("code without constructor");
}
}*/

/* public class constr {
  public constr(){
       System.out.println("With constructor");
}
public static void main(String[] args){
  new constr();
}
}*/


public class constr{
 public static void main (String[] args){
   new constr();
}
public constr(){
 System.out.println("Code with constructor is written after main");
}
}
  
