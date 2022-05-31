package com.ap.SpringBoot.models;

import javax.persistence.*;

@Entity

public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long idPro;

    private String namePro;

    private int datePro;

    private String descPro;

    private String picturePro;

    private String githubPro;


    public Proyectos(){
    }


    public Proyectos(Long idPro, String namePro, int datePro, String descPro, String picturePro, String githubPro) {
        this.idPro = idPro;
        this.namePro = namePro;
        this.datePro = datePro;
        this.descPro = descPro;
        this.picturePro = picturePro;
        this.githubPro = githubPro;
    }


    public Long getIdPro() {
        return idPro;
    }

    public void setIdPro(Long idPro) {
        this.idPro = idPro;
    }

    public String getNamePro() {
        return namePro;
    }

    public void setNamePro(String namePro) {
        this.namePro = namePro;
    }

    public int getDatePro() {
        return datePro;
    }

    public void setDatePro(int datePro) {
        this.datePro = datePro;
    }

    public String getDescPro() {
        return descPro;
    }

    public void setDescPro(String descPro) {
        this.descPro = descPro;
    }

    public String getPicturePro() {
        return picturePro;
    }

    public void setPicturePro(String picturePro) {
        this.picturePro = picturePro;
    }

    public String getGithubPro() {
        return githubPro;
    }

    public void setGithubPro(String githubPro) {
        this.githubPro = githubPro;
    }
}
