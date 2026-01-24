package pet.project.numapapi.entity.common;

import java.io.Serializable;

interface IIdentifiable extends Serializable {
	Long getId();

	void setId(Long id);
}
