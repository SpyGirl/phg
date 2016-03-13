package by.group.apteka.service.packge;

import by.group.apteka.domain.Package;

import java.util.List;

/**
 * Date: Mar 13, 2016
 */
public interface IPackageService {

    Package findById(Integer id);
    List<Package> findPackagesByDrug(String drug);
    Package findWithDetailsById(Integer id);
}
