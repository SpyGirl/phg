package by.group.apteka.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

public class Pharmacy extends BaseEntity<Integer> {

    private String pharmacy;
    private int pharmacyId;
    private String region;
    private String town;
    private String address;
    private int unionId;
    private String prefix;
    private List<Package> packages;

    public String getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
    }

    public int getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(int pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUnionId() {
        return unionId;
    }

    public void setUnionId(int unionId) {
        this.unionId = unionId;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public List<Package> getPackages() {
        return packages;
    }

    public void setPackages(List<Package> packages) {
        this.packages = packages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pharmacy that = (Pharmacy) o;

        return new EqualsBuilder()
                .append(this.getId(), that.getId())
                .append(this.pharmacyId, that.pharmacyId)
                .append(this.prefix, that.prefix)
                .append(this.region, that.region)
                .append(this.town, that.town)
                .append(this.address, that.address)
                .append(this.packages, that.packages)
                .isEquals();

    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.getId())
                .append(this.pharmacyId)
                .append(this.prefix)
                .append(this.region)
                .append(this.town)
                .append(this.address)
                .append(this.packages)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append(this.getId())
                .append(this.pharmacyId)
                .append(this.prefix)
                .append(this.region)
                .append(this.town)
                .append(this.address)
                .append(this.packages)
                .toString();
    }
}
