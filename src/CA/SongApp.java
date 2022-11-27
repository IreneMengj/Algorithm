package CA;/*
 * SongApp.java
 * @author Wanpin Cai
 * 09/11/2022
 */
import java.util.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SongApp{
    public static void main(String args[]){
        //declare variables
        String songTitle, singer, firstSong, lastSong;
        int rating, max, sum;
        double average;

        int i = 0;
        //declare and create objects
        Song[] song = new Song[100];



        Scanner sc = new Scanner(System.in);

        //Input
        OUT:
        while(true){
            Song myS = new Song();
            System.out.println("=============== Menu ===============");
            System.out.println("1 Add the song title");
            System.out.println("2 Display the first entered item");
            System.out.println("3 Display the last entered item");
            System.out.println("4 Calculate and display the average value");
            System.out.println("5 Display the highest rating");
            System.out.println("6 Exit application");
            System.out.println("Please choice your command number:");
            int command = sc.nextInt();

            switch(command){
                case 1:
                    //add item
                    System.out.println("Please add the song title: ");
                    songTitle = sc.next();
                    myS.setSongTitle(songTitle);
                    System.out.println("Please add the singer: ");
                    singer = sc.next();
                    myS.setSinger(singer);
                    System.out.println("Please enter the rating(1-10):");
                    rating = sc.nextInt();
                    myS.setRating(rating);
                    song[i]=myS;
                    i++;

                    break;

                case 2:
                    // first item
                    //SongComputeFirst myCF = new SongComputeFirst();
                    //myCA.computeFirst();
                    //System.out.println("The first song is:"+song[0]);
                    songTitle = song[0].getSongTitle();
                    singer = song[0].getSinger();
                    rating=song[0].getRating();


                    System.out.println("The song title: "+songTitle+", singer: "+singer+", rating: "+rating);
                    break;
                case 3:
                    // last item
                    //SongComputeAvg myCL = new SongComputeLast();
                    //myCA.computeLast();
                    //System.out.println("The first song is:"+song[length-1]);
                    break;
                case 4:
                    // average rating
                    //SongComputeAvg myCA = new SongComputeAvg();
                    //myCA.computeAvg();
                    break;
                case 5:
                    // highest rating
                    SongCompute myS1 = new SongCompute();
                    myS1.compute();
                    break;
                case 6:
                    //exit the loop1
                    System.out.println("You are exit.");
                    break OUT;
                default:
                    System.out.println("Sorry, your enter is wrong. Please enter 1-6.");
            }
        }

    }//main

}//class
