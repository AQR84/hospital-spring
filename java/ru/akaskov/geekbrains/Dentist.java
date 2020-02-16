package ru.akaskov.geekbrains;

import org.springframework.stereotype.Component;

@Component("doctor")
public class Dentist implements Doctor {
    public void diagnosis(PatientCard patientCard) {
        System.out.println("Диагноз: "+patientCard.getFio()+" болен зуб:"+patientCard.getDiseaseName());
    }

}
