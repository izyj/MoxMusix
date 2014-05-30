package classes;

import java.util.ArrayList;

public class Playlist {
	
		private int idPlaylist;
		private String nomPlaylist;
		private ArrayList<Chanson> lesChansons;
		private ArrayList<Album> lesAlbums;
		
		
		
		public Playlist() {
			super();
		}


		public Playlist(int idPlaylist, String nomPlaylist,
				ArrayList<Chanson> lesChansons, ArrayList<Album> lesAlbums) {
			super();
			this.idPlaylist = idPlaylist;
			this.nomPlaylist = nomPlaylist;
			this.lesChansons = lesChansons;
			this.lesAlbums = lesAlbums;
		}


		public int getIdPlaylist() {
			return idPlaylist;
		}


		public void setIdPlaylist(int idPlaylist) {
			this.idPlaylist = idPlaylist;
		}


		public String getNomPlaylist() {
			return nomPlaylist;
		}


		public void setNomPlaylist(String nomPlaylist) {
			this.nomPlaylist = nomPlaylist;
		}


		public ArrayList<Chanson> getLesChansons() {
			return lesChansons;
		}


		public void setLesChansons(ArrayList<Chanson> lesChansons) {
			this.lesChansons = lesChansons;
		}


		public ArrayList<Album> getLesAlbums() {
			return lesAlbums;
		}


		public void setLesAlbums(ArrayList<Album> lesAlbums) {
			this.lesAlbums = lesAlbums;
		}
		
		
	

}
