package by.group.apteka.repository.packge;

import by.group.apteka.domain.Package;
import by.group.apteka.repository.IBaseRepository;

import java.util.List;

/**
 * Date: Март 12, 2016
 */
public interface IPackageRepository extends IBaseRepository<Integer, Package> {

    List<Package> findPackagesByDrug(String drug);

    Package findWithDetailsById(Integer id);
}
