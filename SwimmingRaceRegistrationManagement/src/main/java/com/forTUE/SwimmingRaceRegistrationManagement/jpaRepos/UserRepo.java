package com.forTUE.SwimmingRaceRegistrationManagement.jpaRepos;

import com.forTUE.SwimmingRaceRegistrationManagement.models.RegUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<RegUser,Long> {
}
