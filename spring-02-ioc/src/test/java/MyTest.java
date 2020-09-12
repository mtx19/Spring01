import com.m.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("newbeans.xml");
        Person person=(Person)context.getBean("person");
        person.getDog().Shout();
        person.getCat().Shout();
    }
}
