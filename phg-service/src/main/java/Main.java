import by.group.apteka.domain.Package;
import by.group.apteka.service.packge.IPackageService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Date: Март 12, 2016
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("by.group.apteka.service/spring-service-context.xml");
        IPackageService packageService = context.getBean(IPackageService.class);
        Package aPackage = packageService.findWithDetailsById(1);
        System.out.println(aPackage);
    }
}
