public class TreatmentRecord {
    private String treatmentId;
    private String patientId;
    private String patientName;
    private String doctorName;
    private String treatmentDiagnosis;
    private String date;

    public TreatmentRecord(String treatmentId, String patientId, String patientName, String doctorName, String treatmentDiagnosis, String date) {
        this.treatmentId = treatmentId;
        this.patientId = patientId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.treatmentDiagnosis = treatmentDiagnosis;
        this.date = date;
    }

    public String getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(String treatmentId) {
        this.treatmentId = treatmentId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getTreatmentDiagnosis() {
        return treatmentDiagnosis;
    }

    public void setTreatmentDiagnosis(String treatmentDiagnosis) {
        this.treatmentDiagnosis = treatmentDiagnosis;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TreatmentRecord{" +
                "treatmentId='" + treatmentId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", patientName='" + patientName + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", treatmentDiagnosis='" + treatmentDiagnosis + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}