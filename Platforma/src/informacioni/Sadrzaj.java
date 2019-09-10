package informacioni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "tip_sadrzaja")
public class Sadrzaj {
	
	@TableGenerator(name = "sadrzaj_gen", table = "id_sadrzaja_gen", pkColumnName = "gen_name", valueColumnName = "gen_value", allocationSize = 1, pkColumnValue = "sadrzaj_gen")
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "sadrzaj_gen")
	
	private int id;
	
	

	@Column(name = "naziv")
	private String naziv;
	
	
	@Column(name = "opis")
	private String opis;

	
	@Column(name = "velicinaMB")
	private int velicinaMB;
	
	
	@Column(name = "format")
	private String format;

	
	@Column(name = "cena")
	private int cena;
	
	public Sadrzaj() {}
	
	public Sadrzaj(String naziv, String opis, int velicinaMB, String format, int cena) {
		this.naziv=naziv;
		this.opis=opis;
		this.velicinaMB=velicinaMB;
		this.format=format;
		this.cena=cena;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getNaziv(){
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv=naziv;
	}
	public String getOpis(){
		return opis;
	}
	public void setOpis(String opis) {
		this.opis=opis;
	}
	public int getVelicinaMB(){
		return velicinaMB;
	}
	public void setVelicinaMB(int velicinaMB) {
		this.velicinaMB=velicinaMB;
	}
	public String getFormat(){
		return format;
	}
	public void setFormat(String format) {
		this.format=format;
	}
	public int getCena(){
		return cena;
	}
	public void setCena(int cena) {
		this.cena=cena;
	}

}
