package Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.hospital_demo_api.Entity.Department;
public interface DepartmentRepository  extends JpaRepository<Department, Long>{

}
