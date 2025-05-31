package pet.project.numapapi.entity.common;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AIdentifier implements IIdentifiable {
    protected Long id;

    public AIdentifier() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String toString() {
        return this.id != null ? this.id.toString() : null;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        else if (o != null && this.getClass() == o.getClass()) {
            AIdentifier that = (AIdentifier) o;
            if (this.getId() != null) {
                if (!this.getId().equals(that.getId())) {
                    return false;
                }
            }
            else if (that.getId() != null) {
                return false;
            }

            return true;
        }
        else {
            return false;
        }
    }

    public int hashCode() {
        int result = this.getId() != null ? this.getId().hashCode() : super.hashCode();
        return result;
    }
}
