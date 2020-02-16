package ru.akaskov.geekbrains;
import org.springframework.stereotype.Component;

@Component("doctor")
public class Surgeon implements Doctor {

    public void diagnosis(PatientCard patientCard) {
        System.out.println("Диагноз: "+patientCard.getFio()+" болен:"+patientCard.getDiseaseName());
    }

}
