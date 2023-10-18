import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld otherBean =
                applicationContext.getBean("helloworld", HelloWorld.class);
        Cat cat = applicationContext.getBean("catBean", Cat.class);
        Cat otherCat = applicationContext.getBean("catBean", Cat.class);
        System.out.println(bean.getMessage());
        System.out.println(bean.equals(otherBean));
        System.out.println(cat.equals(otherCat));
    }
}