package by.group.apteka.domain;

import java.io.Serializable;

public abstract class BaseEntity<ID> implements Serializable {
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
