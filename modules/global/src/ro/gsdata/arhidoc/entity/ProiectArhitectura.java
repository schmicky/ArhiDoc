package ro.gsdata.arhidoc.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "ARHIDOC_PROIECT_ARHITECTURA")
@Entity(name = "arhidoc$ProiectArhitectura")
public class ProiectArhitectura extends StandardEntity {
    private static final long serialVersionUID = -6906462066175322960L;

    @Column(name = "ARHITECT_NUME_BIROU")
    protected String arhitectNumeBirou;

    @Column(name = "ARHITECT_ADRESA")
    protected String arhitectAdresa;

    @Column(name = "ARHITECT_PERSOANA")
    protected String arhitectPersoana;

    @Column(name = "ARHITECT_NR_SEMNATURA")
    protected String arhitectNrSemnatura;

    @Column(name = "ARHITECT_FILIALA_TERITORIALA")
    protected String arhitectFilialaTeritoriala;

    @Column(name = "BENEFICIAR_NUME")
    protected String beneficiarNume;

    @Column(name = "BENEFICIAR_CNP", nullable = false)
    protected String beneficiarCnp;

    @Column(name = "BENEFICIAR_ADRESA", nullable = false)
    protected String beneficiarAdresa;

    @Column(name = "BENEFICIAR_TELEFON")
    protected String beneficiarTelefon;

    @Column(name = "BENEFICIAR_REPREZENTANT")
    protected String beneficiarReprezentant;

    @Column(name = "BENEFICIAR_CUI")
    protected String beneficiarCui;

    @Column(name = "PROIECT_ADRESA", nullable = false)
    protected String proiectAdresa;

    @Column(name = "PROIECT_SUPRAFATA", nullable = false)
    protected String proiectSuprafata;

    @Column(name = "PROIECT_CARTE_FUNCIARA")
    protected String proiectCarteFunciara;

    @Column(name = "PROIECT_FISA_BUNULUI_IMOBIL")
    protected String proiectFisaBunuluiImobil;

    @Column(name = "PROIECT_NUMAR_CADASTRAL")
    protected String proiectNumarCadastral;

    @Column(name = "PROIECT_LUCRARE_EXECUTATA")
    protected String proiectLucrareExecutata;

    @Column(name = "PROIECT_VALOARE_RON")
    protected String proiectValoareRon;

    @Column(name = "PROIECT_AUTORIZATIA_EXECUTARII_LUCRARII")
    protected String proiectAutorizatiaExecutariiLucrarii;

    public void setArhitectNumeBirou(String arhitectNumeBirou) {
        this.arhitectNumeBirou = arhitectNumeBirou;
    }

    public String getArhitectNumeBirou() {
        return arhitectNumeBirou;
    }

    public void setArhitectAdresa(String arhitectAdresa) {
        this.arhitectAdresa = arhitectAdresa;
    }

    public String getArhitectAdresa() {
        return arhitectAdresa;
    }

    public void setArhitectPersoana(String arhitectPersoana) {
        this.arhitectPersoana = arhitectPersoana;
    }

    public String getArhitectPersoana() {
        return arhitectPersoana;
    }

    public void setArhitectNrSemnatura(String arhitectNrSemnatura) {
        this.arhitectNrSemnatura = arhitectNrSemnatura;
    }

    public String getArhitectNrSemnatura() {
        return arhitectNrSemnatura;
    }

    public void setArhitectFilialaTeritoriala(String arhitectFilialaTeritoriala) {
        this.arhitectFilialaTeritoriala = arhitectFilialaTeritoriala;
    }

    public String getArhitectFilialaTeritoriala() {
        return arhitectFilialaTeritoriala;
    }

    public void setBeneficiarCui(String beneficiarCui) {
        this.beneficiarCui = beneficiarCui;
    }

    public String getBeneficiarCui() {
        return beneficiarCui;
    }

    public void setProiectCarteFunciara(String proiectCarteFunciara) {
        this.proiectCarteFunciara = proiectCarteFunciara;
    }

    public String getProiectCarteFunciara() {
        return proiectCarteFunciara;
    }

    public void setProiectFisaBunuluiImobil(String proiectFisaBunuluiImobil) {
        this.proiectFisaBunuluiImobil = proiectFisaBunuluiImobil;
    }

    public String getProiectFisaBunuluiImobil() {
        return proiectFisaBunuluiImobil;
    }

    public void setProiectNumarCadastral(String proiectNumarCadastral) {
        this.proiectNumarCadastral = proiectNumarCadastral;
    }

    public String getProiectNumarCadastral() {
        return proiectNumarCadastral;
    }

    public void setProiectLucrareExecutata(String proiectLucrareExecutata) {
        this.proiectLucrareExecutata = proiectLucrareExecutata;
    }

    public String getProiectLucrareExecutata() {
        return proiectLucrareExecutata;
    }

    public void setProiectValoareRon(String proiectValoareRon) {
        this.proiectValoareRon = proiectValoareRon;
    }

    public String getProiectValoareRon() {
        return proiectValoareRon;
    }

    public void setProiectAutorizatiaExecutariiLucrarii(String proiectAutorizatiaExecutariiLucrarii) {
        this.proiectAutorizatiaExecutariiLucrarii = proiectAutorizatiaExecutariiLucrarii;
    }

    public String getProiectAutorizatiaExecutariiLucrarii() {
        return proiectAutorizatiaExecutariiLucrarii;
    }


    public void setBeneficiarTelefon(String beneficiarTelefon) {
        this.beneficiarTelefon = beneficiarTelefon;
    }

    public String getBeneficiarTelefon() {
        return beneficiarTelefon;
    }

    public void setBeneficiarReprezentant(String beneficiarReprezentant) {
        this.beneficiarReprezentant = beneficiarReprezentant;
    }

    public String getBeneficiarReprezentant() {
        return beneficiarReprezentant;
    }


    public void setBeneficiarNume(String beneficiarNume) {
        this.beneficiarNume = beneficiarNume;
    }

    public String getBeneficiarNume() {
        return beneficiarNume;
    }

    public void setBeneficiarCnp(String beneficiarCnp) {
        this.beneficiarCnp = beneficiarCnp;
    }

    public String getBeneficiarCnp() {
        return beneficiarCnp;
    }

    public void setBeneficiarAdresa(String beneficiarAdresa) {
        this.beneficiarAdresa = beneficiarAdresa;
    }

    public String getBeneficiarAdresa() {
        return beneficiarAdresa;
    }

    public void setProiectAdresa(String proiectAdresa) {
        this.proiectAdresa = proiectAdresa;
    }

    public String getProiectAdresa() {
        return proiectAdresa;
    }

    public void setProiectSuprafata(String proiectSuprafata) {
        this.proiectSuprafata = proiectSuprafata;
    }

    public String getProiectSuprafata() {
        return proiectSuprafata;
    }


}