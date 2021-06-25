import java.util.*;

class Square extends Thread{
  double side;
  double as;
  Square(double x){
   side = x; 
  }
  public void run(){
   try{
      as = side * side; 
     
   }
    
  }
  
}
