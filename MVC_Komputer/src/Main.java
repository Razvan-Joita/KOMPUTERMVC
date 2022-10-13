public class Main {
    public static void main(String[] args)
    {
        KomputerModel model  = retriveCourseFromDatabase();

        //Create a view : to write course details on console
        KomputerView view = new KomputerView();

        KomputerController controller = new KomputerController(model, view);

        controller.updateView();

        //update model data

        System.out.println("nAfter updating, Course Details are as follows");

        controller.updateView();
        //System.out.println("Hello world!");
    }

    private static KomputerModel retriveCourseFromDatabase(){
        KomputerModel komputer = new KomputerModel();
        komputer.setName("PC HP ");
        komputer.setId("01");
        komputer.setCategory("INTEL I7");
        return komputer;
    }

}