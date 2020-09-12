import com.m.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

@Test
    public void test(){
    ApplicationContext context=new ClassPathXmlApplicationContext("mybeans.xml");
    Student student=context.getBean("newstudent",Student.class);
    Student student1=context.getBean("newstudent",Student.class);
    System.out.println(student.hashCode());
    System.out.println(student1.hashCode());
    System.out.println(student);
}
}
