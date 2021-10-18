package vntu.fcsa.gonchar.jwtproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import vntu.fcsa.gonchar.jwtproject.models.Role;
import vntu.fcsa.gonchar.jwtproject.models.ERole;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
