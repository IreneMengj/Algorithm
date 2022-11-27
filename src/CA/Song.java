package CA;/*
        * Song.java
        * @author Wanpin Cai
        * 09/11/2022
        */

public class Song{
    //Declare vatiables
    private String songTitle;
    private String singer;
    private int rating, sum;
    private double average;
    double max;

    //constructors
    public Song(){
    }


    public Song(String songTitle, String singer, int rating, double average){
        this.songTitle = songTitle;
        this.singer = singer;
        this.rating = rating;
        this.average = average;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String toString(){
        return "Song{SongTitle: "+songTitle+", singer: "+singer+"rating: "+rating+"}";
    }

}//class