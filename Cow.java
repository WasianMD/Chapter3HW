public class Cow extends farmAnimal{
  
  
  private String sound = "Moo Moo";
  
    public Livestock(String name, String gender, double weight, int age)
    {
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
  
  @Override
  public String toString(){
      return "Cow " + sound + " [name=" + name + ", gender=" + gender + ", weight=" + weight + ", age=" + age + "]";
    }
  @Override
  public String feedLoadingSchedule(){
    return "6am-4pm";

}
