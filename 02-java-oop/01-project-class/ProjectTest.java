public class ProjectTest{
    public static void main(String[] args){
        Project testProject = new Project("Add Helipad", "CBD project", 10000000.00);
        testProject.setName("Downtown");
        testProject.setDescription("Number 1 project");
        testProject.setCost(8000.99);
        // System.out.println(testProject.getName());
        // System.out.println(testProject.getDescription());
        // System.out.println(testProject.getCost());
        System.out.println(testProject.elevatorPitch());
    }
}