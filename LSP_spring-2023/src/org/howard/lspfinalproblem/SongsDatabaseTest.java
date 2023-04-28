package org.howard.lspfinalproblem;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SongsDatabaseTest {

    SongsDatabase songsDatabase = new SongsDatabase();
    Map<String, HashSet<String>> map =
            new HashMap<String, HashSet<String>>();



    @Test
    void addSong() {
        songsDatabase.addSong("RNB", "If could Turn back Time");
        songsDatabase.addSong("RNB", "Halo");
        assertEquals(songsDatabase.getMap().get("RNB").contains("If could Turn back Time") && songsDatabase.getMap().get("RNB").contains("Halo"), true );
    }

    @Test
    void getSongs() {
        songsDatabase.addSong("Rap", "Savage");

        HashSet<String> getSongs = (HashSet<String>) songsDatabase.getSongs("Rap");
        assertEquals(getSongs.toArray()[0] , "Savage");
    }

    @Test
    void getGenreOfSong() {
        songsDatabase.addSong("Rap", "Gin and Juice");
        assertEquals(songsDatabase.getGenreOfSong("Gin and Juice"), "Rap");
    }

    @Test
    void getMap() {

        //add song to the song Database
        songsDatabase.addSong("RNB", "If could Turn back Time");
        songsDatabase.addSong("RNB", "Halo");
        songsDatabase.addSong("Rap", "Savage");
        songsDatabase.addSong("Rap", "Gin and Juice");

        //Add songs to 2 Hashsets
        HashSet<String> songList1 = new HashSet<String>();
        HashSet<String> songList2 = new HashSet<String>();
        songList1.add("Savage");
        songList1.add("Gin and Juice");
        songList2.add("If could Turn back Time");
        songList2.add("Halo");

        //Add the hashset to a map an compare it to the database
        map.put("Rap", songList1);
        map.put("RNB", songList2);
        assertEquals(songsDatabase.getMap(), map );
    }
    @Test
    void getGenreOfNonExistingSong() {
    assertEquals(songsDatabase.getGenreOfSong("Dombolo"), "");
    }

    //Test a get of a non-existing song
    @Test
    void getNonExistingSongs() {

    HashSet<String> getSongs = (HashSet<String>) songsDatabase.getSongs("Rap");
    assertEquals(getSongs , new HashSet<String>());
    }
}