package informacioni;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import informacioni.SadrzajService;


@ManagedBean
public class SadrzajController {
	private String naziv;
	private String opis;
	private String velicinaMB;
	private String format;
	private String cena;
	private String bid;
	private String aid;
	private Sadrzaj sadrzaj = new Sadrzaj();
	

	@EJB
	private SadrzajService service;


	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getVelicinaMB() {
		return velicinaMB;
	}

	public void setVelicinaMB(String velicinaMB) {
		this.velicinaMB = velicinaMB;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getCena() {
		return cena;
	}

	public void setCena(String cena) {
		this.cena = cena;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public Sadrzaj getSadrzaj() {
		return sadrzaj;
	}

	public void setSadrzaj(Sadrzaj sadrzaj) {
		this.sadrzaj = sadrzaj;
	}

	@Override
	public String toString() {
		return "SadrzajController [aid=" + aid + ", bid=" + bid + ", cena=" + cena + ", format=" + format + ", naziv="
				+ naziv + ", opis=" + opis + ", sadrzaj=" + sadrzaj + ", velicinaMB=" + velicinaMB + "]";
	}

	public void prikazi() {
		System.out.println("Odobreno!");
	}

	public void updateSadrzaj(String aid, Sadrzaj s) {
		service.updateSadrzaj(aid, s);
	}
	
	
	public void brisiSadrzaj(String bid){
		service.deleteSadrzaj(bid);
	}
	
	public void dodajSadrzaj(String naziv, String opis, String velicinaMB, String format, String cena) {
		service.addSadrzaj(naziv, opis, velicinaMB, format, cena);
	}
}
