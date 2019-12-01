package in.co.myleadingskills.springioc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	System.out.println("Application context is initialized and reading XML configuration" + context);
        Sim sim = context.getBean("sim",Sim.class);
        sim.call();
        sim.internet();
    }
}
