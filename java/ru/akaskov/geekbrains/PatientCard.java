package ru.akaskov.geekbrains;

public class PatientCard {
    private String fio;
    private String diseaseName;

    public PatientCard(String fio, String diseaseName) {
        this.fio = fio;
        this.diseaseName = diseaseName;
    }

    public String getFio() {
        return fio;
    }

    public String getDiseaseName() {
        return diseaseName;
    }
}
