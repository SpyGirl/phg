package by.group.apteka.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Date: Mar 13, 2016
 */
public class PackageDetails implements Serializable {

    private double remainder;
    private int price3;
    private Pharmacy pharmacy;

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

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PackageDetails that = (PackageDetails) o;

        return new EqualsBuilder()
                .append(this.pharmacy, that.pharmacy)
                .append(this.price3, that.price3)
                .append(this.remainder, that.remainder)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.pharmacy)
                .append(this.price3)
                .append(this.remainder)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append(this.pharmacy)
                .append(this.price3)
                .append(this.remainder)
                .toString();
    }
}
