public class farmAnimal{

  
  //attributes
  private String name;
  private String gender;
  private double weight; //Pounds
  private int age;  //Years
  
  public Livestock(String name, String gender, double weight, int age){
    this.name = name;
    this.gender = gender;
    this.weight = weight;
    this.age = age;
  }
    
   public String getName(){
        return name;
    }
    public void setName(String)
    public String getGender(){
        return gender;
    }
    public void setGender(String)
    public double getWeight(){
        return weight;
    }
    public void setWeight(int)
      
    abstract void feedLoadingSchedule();    
   
    public String toString(){
        return "Name: " + name + "/n" + "Gender: " + gender + "/n" + "Weight: " + weight + "/n" + "Age: " + age + "/n";
    }
}
