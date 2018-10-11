package com.cloud.usersvr.responsity;

import com.cloud.usersvr.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dongyl
 * @date 10/16/17.
 * @project user-provider
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
