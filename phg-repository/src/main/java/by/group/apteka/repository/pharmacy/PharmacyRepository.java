package by.group.apteka.repository.pharmacy;

import by.group.apteka.domain.Pharmacy;
import by.group.apteka.repository.BaseRepository;

/**
 * Date: Март 12, 2016
 */
public class PharmacyRepository extends BaseRepository<Integer, Pharmacy> implements IPharmacyRepository {

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Delete operation for pharmacies is not supported.");
    }

    @Override
    protected String getNamespace() {
        return "IPharmacyMapper";
    }
}
