import java.util.*;

public class CustomReport {

    public static void main(String[] args) {
        try{
            String filePath ="/home/tyfah/IdeaProjects/FirstReport/src/main/resources/Student.jrxml";
            //Creating objects of Subject
            Subject sub1 = new Subject("Java", 89);
            Subject sub2 = new Subject("MySql", 95);
            Subject sub3 = new Subject("JavaScript", 60);
            Subject sub4 = new Subject("C#", 67);
            Subject sub5 = new Subject("PHP", 75);

            //Passing the objects to a list
            List<Subject> list = new ArrayList<>();
            list.add(sub1);
            list.add(sub2);
            list.add(sub3);
            list.add(sub4);
            list.add(sub5);
            //Passing The list to the JasperReport
            //Compile the The jasperReport
            //Convert to pdf

            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("studentName","Tafadzwa");

        }catch(Exception e){
            System.out.println("Error While Generating the Report.....");
        }
    }
}
