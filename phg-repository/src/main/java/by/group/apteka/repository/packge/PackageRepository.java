package by.group.apteka.repository.packge;

import by.group.apteka.domain.Package;
import by.group.apteka.repository.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Date: Март 12, 2016
 */
@Repository
public class PackageRepository extends BaseRepository<Integer, Package> implements IPackageRepository {

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Delete operation for packages is not supported.");
    }

    @Override
    public void insert(Package packge) {
        throw new UnsupportedOperationException("Insert operation for packages is not supported.");
    }

    @Override
    public List<Package> findPackagesByDrug(String drug) {
        return getTemplate().selectList(getNamespace() + ".findPackagesByDrug", drug);
    }

    @Override
    protected String getNamespace() {
        return "IPackageMapper";
    }
}
