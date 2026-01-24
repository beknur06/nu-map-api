package pet.project.numapapi.entity.common;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;
import org.springframework.context.i18n.LocaleContextHolder;

@MappedSuperclass
public abstract class ADictionary extends AuditEntity {

    protected String code;
    protected String valueRu;
    protected String valueKz;
    protected Boolean isDeleted = false;

    @Basic
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "VALUE_RU")
    public String getValueRu() {
        return valueRu;
    }

    public void setValueRu(String valueRu) {
        this.valueRu = valueRu;
    }

    @Basic
    @Column(name = "VALUE_KZ")
    public String getValueKz() {
        return valueKz;
    }

    public void setValueKz(String valueKz) {
        this.valueKz = valueKz;
    }

    @Basic
    @Column(name = "IS_DELETED")
    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @Transient
    public String getValue() {
        if (LocaleContextHolder.getLocale().toString().equals("kz")) {
            return this.valueKz;
        }
        else {
            return this.valueRu;
        }
    }

    @Override
    public String toString() {
        return getValue();
    }
}
