package by.group.apteka.service.packge;

import by.group.apteka.domain.Package;
import by.group.apteka.repository.api.packge.IPackageRepository;
import by.group.apteka.service.AbstractService;
import by.group.apteka.service.api.IPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Date: Mar 13, 2016
 */
@Service
public class PackageService extends AbstractService implements IPackageService {

    private static final int MINIMUM_DRUG_TITLE_LENGTH = 3;

    @Autowired
    private IPackageRepository packageRepository;

    @Override
    public Package findById(Integer id) {
        return packageRepository.findById(id);
    }

    @Override
    public List<Package> findPackagesByDrug(String drug) {
        if (drug.length() < MINIMUM_DRUG_TITLE_LENGTH) {
            return Collections.emptyList();
        }
        return packageRepository.findPackagesByDrug(drug);
    }

    @Override
    public Package findWithDetailsById(Integer id) {
        return packageRepository.findWithDetailsById(id);
    }
}
