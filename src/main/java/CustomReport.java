import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.*;

public class CustomReport {

    public static void main(String[] args) {
        try{
            String filePath ="/home/tyfah/IdeaProjects/StudentReport/src/main/resources/Student.jrxml";
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
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);

            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("studentName","Tafadzwa");
            parameters.put("tableData", dataSource);
            //Compile the The jasperReport
            net.sf.jasperreports.engine.JasperReport report = JasperCompileManager.compileReport(filePath);
            JasperPrint print = JasperFillManager.fillReport(report,parameters,new JREmptyDataSource());
            //Convert to pdf
            JasperExportManager.exportReportToPdfFile(print,"/home/tyfah/IdeaProjects/student.pdf");

            System.out.println("Report Created......");


        }catch(Exception e){
            System.out.println("Error While Generating the Report.....");
        }
    }
}
