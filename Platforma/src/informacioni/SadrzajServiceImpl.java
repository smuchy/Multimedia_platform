package informacioni;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import informacioni.SadrzajService;
import informacioni.Sadrzaj;


@Stateless
public class SadrzajServiceImpl implements SadrzajService {
	@PersistenceContext(name="informacioni")
	private EntityManager em;
	
	@Override
	public void addSadrzaj(String naziv, String opis, String velicinaMB, String format, String cena) {
		try {
			
			int v=Integer.parseInt(velicinaMB);
			int c=Integer.parseInt(cena);
			Sadrzaj s1=new Sadrzaj(naziv,opis,v,format,c);
			
			em.persist(s1);
			
			

		} catch(Exception ex) {
			
			System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
			
		}
	}
	
	@Override
	public void updateSadrzaj(String id, Sadrzaj s) {
	try{
	    int kid=Integer.parseInt(id);
	    Sadrzaj s1=em.find(Sadrzaj.class, kid);
	    
	    if(s.getNaziv()!="") {
	    	s1.setNaziv(s.getNaziv());
	    }
	    if(s.getOpis()!="") {
	    	s1.setOpis(s.getOpis());
	    }
	    if(s.getVelicinaMB()!=0) {
	    	s1.setVelicinaMB(s.getVelicinaMB());
	    }
	    if(s.getFormat()!="") {
	    	s1.setFormat(s.getFormat());
	    }
	    if(s.getCena()!=0) {
	    	s1.setCena(s.getCena());
	    }
	        } catch(Exception ex) {
		
		System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
		
		}  
	
	}
	
	@Override
	public void deleteSadrzaj(String bid) {
		try{
			 
		    int kid=Integer.parseInt(bid);
		    Sadrzaj a1 =em.find(Sadrzaj.class, kid);
		    em.remove(a1);
		        } catch(Exception ex) {
			
			System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
			
			}
	}}

