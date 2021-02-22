public class Project{
    public String name;
    public String description;
    public String cost;
    
    public String elevatorPitch(){
        return(this.getName() + " : " + this.getCost() + " : " + this.getDescription());
    }
    public Project(){
        this.name = "";
        this.description = "";
        this.cost = "300000000";
    }
    public Project(String projectName){
        this.name = projectName;
        this.description = "";
        this.cost = "300000000";  
    }
    public Project(String projectName, String projectDescription){
        this.name = projectName;
        this.description = projectDescription;
        this.cost = "300000000";
    }
    public Project(String projectName, String projectDescription, String projectCost){
        this.name = projectName;
        this.description = projectDescription;
        this.cost = projectCost;        
    }

    public void setName(String newName){
        this.name = newName;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    public void setCost(String projectCost){
        this.cost = projectCost;
    }

    public String getName() {
        return (name);
    }
    public String getDescription(){
        return (description);
    }
    public String getCost(){
        return (cost);
    }
}