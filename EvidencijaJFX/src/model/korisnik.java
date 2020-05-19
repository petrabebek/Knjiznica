package model;

import java.util.Date;

public class korisnik extends Table {
    @Entity(type = "INTEGER", size = 11, primary = true)
    int id;

    @Entity(type = "VARCHAR", size = 15, isnull = false)
    String ime;

    @Entity(type = "VARCHAR", size = 15, isnull = false)
    String prezime;

    @Entity(type = "DATETIME", isnull = false)
    Date datum_rodjenja;

    @Entity(type = "VARCHAR", size = 30, isnull = false)
    String korisnicko_ime;

    @Entity(type = "VARCHAR", size = 15, isnull = false)
    String sifra;

    @Entity(type = "VARCHAR", size = 50, isnull = false)
    String email;

    @ForeignKey(table = "tip_korisnika", attribute = "id")
    @Entity(type = "INTEGER", size =11)
    int id_tipa_korisnika;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Date getDatum_rodjenja() {
        return datum_rodjenja;
    }

    public void setDatum_rodjenja(Date datum_rodjenja) {
        this.datum_rodjenja = datum_rodjenja;
    }

    public String getKorisnicko_ime() {
        return korisnicko_ime;
    }

    public void setKorisnicko_ime(String korisnicko_ime) {
        this.korisnicko_ime = korisnicko_ime;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_tipa_korisnika() {
        return id_tipa_korisnika;
    }

    public void setId_tipa_korisnika(int id_tipa_korisnika) {
        this.id_tipa_korisnika = id_tipa_korisnika;
    }
}
