//code for default constructor 
 
public class Pet{

String pettype;
String petname;
int age;

public Pet(){
pettype = "Dog";
petname = "Tommy";
age = 2;
}

public static void main(String[] args){
 Pet myPet = new Pet();

System.out.println("Type of Pet:"+myPet.pettype);
System.out.println("Name of Pet:"+myPet.petname);
System.out.println("Age of Pet:"+myPet.age);
  }
}
