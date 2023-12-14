package net.orgranization.repository;

import net.orgranization.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization,Long> {

    Optional<Organization> findByCode(String organizationCode);
}
