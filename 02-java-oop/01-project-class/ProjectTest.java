public class ProjectTest{
    public static void main(String[] args){
        Project testProject = new Project("no1project", "billion $ project", "300000000");
        testProject.setName("best project");
        testProject.setDescription("billion $ project");
        testProject.setCost("300000000");
        System.out.println(testProject.getName());
        System.out.println(testProject.getDescription());
        System.out.println(testProject.getCost());
        System.out.println(testProject.elevatorPitch());
    }
}