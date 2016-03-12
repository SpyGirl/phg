package by.group.apteka.repository.packge;

import by.group.apteka.domain.Package;
import by.group.apteka.repository.BaseRepository;
import org.springframework.stereotype.Repository;

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
    protected String getNamespace() {
        return "IPackageMapper";
    }
}
