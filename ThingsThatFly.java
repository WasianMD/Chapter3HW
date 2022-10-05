public class thingsThatFly extends flight{
  
    public static void main(String[] args){
       
      Fly[] wings = new Fly[3];

		  wings[0] = new Plane("Boeing 747", 2016);
		  wings[1] = new Bird("Eagle");
      wings[2] = new Bird("Hummingbird");
      
         for(int i = 0; i < wings.length; i++)
         {
           if(i < 1){
             System.out.println("Airplane [model=" + wings[i] + "]: I'm an airplane that relies on an engine to fly."); 
           }
           else
             System.out.println("Bird [type=" + wings[i] + "]: I'm a bird who flaps my wings to fly.");
         }
    }
}
