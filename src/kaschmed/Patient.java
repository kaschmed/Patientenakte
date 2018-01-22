/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaschmed;

/**
 *
 * @author Francesca Kaschnig
 */
class Patient {
    String vorname;
    String nachname;
    int iD;
    int telefonNr;
    int sVN;
    String geschlecht;

    public Patient(String vorname, String nachname, int iD, int telefonNr, int sVN, String geschlecht) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.iD = iD;
        this.telefonNr = telefonNr;
        this.sVN = sVN;
        this.geschlecht = geschlecht;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getiD() {
        return iD;
    }

    public int getTelefonNr() {
        return telefonNr;
    }

    public int getsVN() {
        return sVN;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

}
