package org.howard.lspfinalproblem;

import java.util.Set;

public class Main {
	 public static void main(String[] args) {

		    SongsDatabase songsDatabase = new SongsDatabase();

		        songsDatabase.addSong("RNB", "If could Turn back Time");
		        songsDatabase.addSong("RNB", "Halo");

		        songsDatabase.getSongs("RNB");
		        songsDatabase.getSongs("Rap");

		        songsDatabase.getGenreOfSong("Halo");

		        SongsDatabase db = new SongsDatabase();
		        db.addSong("Rap", "Savage");
		        db.addSong("Rap", "Gin and Juice");
		        db.addSong("Jazz", "Always There");
		        Set<String> songs = db.getSongs("Rap"); // contains Savage and
		        // Gin and Juice
		        System.out.println( db.getGenreOfSong("Savage") );// prints “Rap”
		        System.out.println( db.getGenreOfSong("Always There") );// prints“Jazz”

		    }
		}

