package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospital_demo_api.Entity.PatientRecord;

import Services.PatientRecordService;

@RestController
@RequestMapping("/patient_records")
public class PatientRecordController {

    @Autowired
    private PatientRecordService patientRecordService;

    @GetMapping
    public List<PatientRecord> getAllPatientRecords() {
        return patientRecordService.getAllPatientRecords();
    }

    @PostMapping
    public PatientRecord createPatientRecord(@RequestBody PatientRecord record) {
        return patientRecordService.createPatientRecord(record);
    }

    @GetMapping("/{id}")
    public PatientRecord getPatientRecordById(@PathVariable Long id) {
        return patientRecordService.getPatientRecordById(id);
    }
}
