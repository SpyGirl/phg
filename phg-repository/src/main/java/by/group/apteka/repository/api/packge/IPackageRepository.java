package by.group.apteka.repository.api.packge;

import by.group.apteka.domain.Package;
import by.group.apteka.repository.api.IBaseRepository;

import java.util.List;

/**
 * Date: Mar 12, 2016
 */
public interface IPackageRepository extends IBaseRepository<Integer, Package> {

    List<Package> findPackagesByDrug(String drug);

    Package findWithDetailsById(Integer id);
}
