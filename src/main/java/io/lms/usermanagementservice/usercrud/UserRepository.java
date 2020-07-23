package io.lms.usermanagementservice.usercrud;

import io.lms.usermanagementservice.model.LMSUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<LMSUser, Long>
{
} 