package Demo.ProjectMaven;

import java.util.ArrayList;
import java.util.Collections;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration(); 
    	cfg.configure("hiber.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
   
   
 Session session = factory.openSession(); 
//   Transaction t = session.beginTransaction();  
//   std.setId(101);
//   std.setName("railworld");
//   std.setRollno(1);
 	 ArrayList<StudentTest> user = new ArrayList<>();
 
// 	t.commit();
//      user.add(new StudentTest(5, "deepak",101));
//      user.add(new StudentTest(2, "ashish",102));
//      user.add(new StudentTest(3, "sakshi",103));
//      user.add(new StudentTest(4, "sneha",104));
//      user.add(new StudentTest(5, "Ankit",105));
//      
 	for(StudentTest i:user) {
 		session.save(i);
 		  
 	}
 	
   System.out.println(user);
   session.close();
   factory.close();

   System.out.println("saved the data");
   
   
    }
}