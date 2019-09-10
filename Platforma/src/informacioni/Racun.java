
package informacioni;

import javax.persistence.*;

@Entity
@Table(name = "racun_korisnika")
public class Racun {
	
	@TableGenerator(name = "racun_gen", table = "id_racuna_gen", pkColumnName = "gen_name", valueColumnName = "gen_value", allocationSize = 1, pkColumnValue = "racun_gen")
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "racun_gen")
	
	private int broj_racuna;
	
	@Basic
	@Column(name = "stanje")
	private int stanje;
	
	public void setBroj_racuna(int broj_racuna) {
		this.broj_racuna=broj_racuna;
	}
	public int getBroj_racuna(){
		return broj_racuna;
	}
	
	public int getStanje() {
		return stanje;
	}
	public void setStanje(int stanje) {
		this.stanje=stanje;
	}
	
	public Racun() {}
	public Racun(int stanje) {
		this.stanje=stanje;
	}
	
	@Override
    public String toString() {
	
	        return "Stanje: "+ this.stanje;
	
	    }
}
