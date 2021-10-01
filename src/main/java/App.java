import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        boolean compareHelloWorld = bean1 == bean2;
        System.out.println(compareHelloWorld);

        Cat bean3 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.getName());

        Cat bean4 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean4.getName());

        boolean compareCat = bean3 == bean4;
        System.out.println(compareCat);

    }
}