package ru.akaskov.geekbrains;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

    @Bean(name="doctor")
    public Doctor doctor(){
        return new Dentist();
    }


    @Bean(name="patientCard")
    public PatientCard patientCard(){
        PatientCard patientCard = new PatientCard("Artem K","7 top");
        return patientCard;
    }

    @Scope("prototype")
    @Bean(name="registry")
    public Registry registry(PatientCard patientCard, Doctor doctor){
        Registry registry = new Registry();
        registry.setDoctor(doctor);
        registry.setPatientCard(patientCard);
        return registry;
    }

}
