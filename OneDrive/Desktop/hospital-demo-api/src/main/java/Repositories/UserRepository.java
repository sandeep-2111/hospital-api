package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.hospital_demo_api.Entity.User;
public interface UserRepository extends JpaRepository<User, Long> {
	 User findByUsername(String username);
}
