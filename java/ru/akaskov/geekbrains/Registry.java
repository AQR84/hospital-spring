package ru.akaskov.geekbrains;

public class Registry {
    private PatientCard patientCard;
    private Doctor doctor;
    private int numberOffice;
    public Registry(PatientCard patientCard, Doctor doctor) {
        this.patientCard = patientCard;
        this.doctor = doctor;
    }

    public void setPatientCard(PatientCard patientCard) {
        this.patientCard = patientCard;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Registry() {
        numberOffice = numberOffice();
    }

    private int numberOffice() {
        return (int)(Math.random()*100);
    }

    public void gethelp(){
        doctor.diagnosis(patientCard);
        System.out.println("Идите в кабинет: "+numberOffice);
    }
}
