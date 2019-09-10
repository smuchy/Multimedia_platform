package informacioni;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class RacunServiceImpl implements RacunService {
	@PersistenceContext(name="informacioni")
	private EntityManager em;
	
	@Override
	public void getRacun(String bid, Racun racun) {
		int kid = Integer.parseInt(bid);
		 Racun r = em.find(Racun.class, kid);
		 racun.setStanje(r.getStanje());
			
		
	}
}
