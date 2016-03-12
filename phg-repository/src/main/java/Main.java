import by.group.apteka.domain.Package;
import by.group.apteka.repository.packge.PackageRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Date: Март 12, 2016
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("by/group/apteka/repository/sql-context.xml");
        PackageRepository packageRepository = context.getBean(PackageRepository.class);
        Package pckg = new Package();
        pckg.setPackageId(555);
        packageRepository.insert(pckg);
    }
}
