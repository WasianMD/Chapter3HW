public class thingsThatMove extends flight{
  
  abstract void walk();
  abstract void jump();
  
    public static void main(String[] args){
       
      Fly[] wings = new Fly[3];

		  wings[0] = new Plane("Boeing 747", 2016);
		  wings[1] = new Bird("Eagle");
      wings[2] = new Bird("Hummingbird");
      
         for(int i = 0; i < wings.length; i++)
         {
           if(i < 1){
             System.out.println("Airplane [model=" + wings[i] + "]: I rely on my engine to fly./n I tax on my wheels./n I cannot jump.); 
           }
           else
             System.out.println("Bird [type=" + wings[i] + "]: I flap my wings to fly./n I walk on my feet./n I jump by leaping from my feet.");
         }
    }
}
