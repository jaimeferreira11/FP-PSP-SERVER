package py.org.fundacionparaguaya.pspserver.network.entities;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * @author bsandoval
 */
@StaticMetamodel(OrganizationEntity.class)
public class OrganizationEntity_ {

    private static volatile SingularAttribute<OrganizationEntity, ApplicationEntity> application;

    private static volatile SingularAttribute<OrganizationEntity, Long> id;

    private static volatile SingularAttribute<OrganizationEntity, Boolean> isActive;

    private OrganizationEntity_() {}

    public static SingularAttribute<OrganizationEntity, ApplicationEntity> getApplication() {
        return application;
    }

    public static SingularAttribute<OrganizationEntity, Long> getId() {
        return id;
    }

    public static SingularAttribute<OrganizationEntity, Boolean> getIsActive() {
        return isActive;
    }
}