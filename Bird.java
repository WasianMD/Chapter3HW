public class bird implements flight{
  
  private String type;
  
  public Avian(String type)
    {
    this.type = type;
    }
   
  public String getType(){
        return type;
  }
  public void setType(String)
    
  public String toString(){
      return "Bird [type=" + type + "]: I'm a bird who flaps my wings to fly.";
    }
  
}
