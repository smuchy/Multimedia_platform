package informacioni;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class RacunController {
	
	private String stanje;
	private String bid;
	private Racun racun = new Racun();
	
	@EJB
	private RacunService service;
	
	




	public Racun getRacun() {
		return racun;
	}






	public void setRacun(Racun racun) {
		this.racun = racun;
	}






	public String getStanje() {
		return stanje;
	}






	public void setStanje(String stanje) {
		this.stanje = stanje;
	}






	public String getBid() {
		return bid;
	}






	public void setBid(String bid) {
		this.bid = bid;
	}






	public void prikaziRacun(String bid, Racun racun) {
		service.getRacun(bid, racun);
	}

}
