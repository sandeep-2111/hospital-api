package Repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.hospital_demo_api.Entity.PatientRecord;
public interface PatientRecordRepository extends JpaRepository<PatientRecord, Long>{
	
	 List<PatientRecord> findByPatientId(Long patientId);
	    List<PatientRecord> findByDepartmentId(Long departmentId);
}
