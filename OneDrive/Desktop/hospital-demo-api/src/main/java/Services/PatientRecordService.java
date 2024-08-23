package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospital_demo_api.Entity.PatientRecord;

import Repositories.PatientRecordRepository;

@Service
public class PatientRecordService {

    @Autowired
    private PatientRecordRepository patientRecordRepository;

    public List<PatientRecord> getAllPatientRecords() {
        return patientRecordRepository.findAll();
    }

    public PatientRecord createPatientRecord(PatientRecord record) {
        return patientRecordRepository.save(record);
    }

    public PatientRecord getPatientRecordById(Long id) {
        return patientRecordRepository.findById(id).orElse(null);
    }

    public List<PatientRecord> getPatientRecordsByPatientId(Long patientId) {
        return patientRecordRepository.findByPatientId(patientId);
    }

    public List<PatientRecord> getPatientRecordsByDepartmentId(Long departmentId) {
        return patientRecordRepository.findByDepartmentId(departmentId);
    }
}