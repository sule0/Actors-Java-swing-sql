
public class Actors {
    
    
   public Actors(int actor_id, String first_Name, String last_Name) {
      
        this.first_Name = first_Name;
        this.last_Name = last_Name;
    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }
    
    public String getFirst_Name() {
        return first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

 
    private String first_Name;
    private String last_Name;
    private int actor_id;
}
