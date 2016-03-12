package by.group.apteka.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

public class Package extends BaseEntity<Integer> {

    private int packageId;
    private String brand;
    private String drug;
    private String form;
    private double remainder;
    private int price3;
    private List<Pharmacy> pharmacies;

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public double getRemainder() {
        return remainder;
    }

    public void setRemainder(double remainder) {
        this.remainder = remainder;
    }

    public int getPrice3() {
        return price3;
    }

    public void setPrice3(int price3) {
        this.price3 = price3;
    }

    public List<Pharmacy> getPharmacies() {
        return pharmacies;
    }

    public void setPharmacies(List<Pharmacy> pharmacies) {
        this.pharmacies = pharmacies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Package that = (Package) o;

        return new EqualsBuilder()
                .append(this.getId(), that.getId())
                .append(this.packageId, that.packageId)
                .append(this.brand, that.brand)
                .append(this.drug, that.drug)
                .append(this.form, that.form)
                .append(this.price3, that.price3)
                .append(this.remainder, that.remainder)
                .append(this.pharmacies, that.pharmacies)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.getId())
                .append(this.packageId)
                .append(this.brand)
                .append(this.drug)
                .append(this.form)
                .append(this.price3)
                .append(this.remainder)
                .append(this.pharmacies)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append(this.getId())
                .append(this.packageId)
                .append(this.brand)
                .append(this.drug)
                .append(this.form)
                .append(this.price3)
                .append(this.remainder)
                .append(this.pharmacies)
                .toString();
    }
}
