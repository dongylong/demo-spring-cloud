package com.noriental.cloud.responsity;

import com.noriental.cloud.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dongyl
 * @date 10/16/17.
 * @project cloud-demo-user-provider
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
