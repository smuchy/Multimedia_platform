package informacioni;

public interface SadrzajService {
	public void addSadrzaj(String naziv, String opis, String velicinaMB, String format, String cena);
	public void deleteSadrzaj(String bid);
	public void updateSadrzaj(String id, Sadrzaj s);
}
