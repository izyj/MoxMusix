package classes;

public class Chanson {

		private String titre;
		private int idChanson;
		private Genre unGenre;
		
		
		
		public Chanson() {
			super();
		}
		public Chanson(String titre, int idChanson, Genre unGenre) {
			super();
			this.titre = titre;
			this.idChanson = idChanson;
			this.unGenre = unGenre;
		}
		public String getTitre() {
			return titre;
		}
		public void setTitre(String titre) {
			this.titre = titre;
		}
		public int getIdChanson() {
			return idChanson;
		}
		public void setIdChanson(int idChanson) {
			this.idChanson = idChanson;
		}
		public Genre getUnGenre() {
			return unGenre;
		}
		public void setUnGenre(Genre unGenre) {
			this.unGenre = unGenre;
		}
		
		
}
