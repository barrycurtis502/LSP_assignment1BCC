package org.howard.lspfinalproblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
	/* Key is the genre, HashSet contains associated songs */
    private Map<String, HashSet<String>> map =
            new HashMap<String, HashSet<String>>();

    public SongsDatabase(){}
    public SongsDatabase(Map<String, HashSet<String>> map) {
        this.map = map;
    }

    /* Add a song title to a genre */
    public void addSong(String genre, String songTitle) {
        if(!map.containsKey(genre)){
            HashSet<String> newSong = new HashSet<String>();
            newSong.add(songTitle);
            map.put(genre, newSong);
        }else{
            HashSet<String> songList = map.get(genre);
            songList.add(songTitle);
            map.put(genre, songList);
        };
    }

    /* Return the Set that contains all songs for a genre */
    public Set<String> getSongs(String genre) {
        if(map.containsKey(genre)){
            return map.get(genre);
        } else {
            return new HashSet<>();
        }

    }
//
//    /* Return genre, i.e., jazz, given a song title */
    public String getGenreOfSong(String songTitle) {
        for( String key : map.keySet() ){
            if(map.get(key).contains(songTitle)){
                return key;
            }
        }
        return "";
    }

    public Map<String, HashSet<String>> getMap() {
        return map;
    }

}
