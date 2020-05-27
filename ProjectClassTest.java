public class ProjectClassTest {
    public static void main(String[] args) {
        Project project1 = new Project();
        Project project2 = new Project("Beta");
        Project project3 = new Project("Capcom", "The third project.");
        project1.elevatorPitch();
        project2.elevatorPitch();
        project3.elevatorPitch();
        project1.setName("Alpha");
        project1.getName();
        project2.setDescription("The second project.");
        project2.getDescription();
        project1.setDescription("The first project.");
        project1.elevatorPitch();
        project2.elevatorPitch();
        project3.elevatorPitch();
    }
}