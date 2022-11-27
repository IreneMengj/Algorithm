package CA;

public class SongCompute {
    /*
     * SongCompute.java
     * @author Wanpin Cai
     * 09/11/2022
     */


        //Declare vatiables
        private String songTitle, firstSong, lastSong;
        private String singer;
        private int rating,sum;
        private double average;
        private int max;

        //1 addSong




   /*
 //2 firstSong
 public void computeFirst(){
  String Song[];
  songs = new String[10];
  for(int i = 0; i < song.length; i++){

   }
  System.out.println("The first song is:"+song[0]);
  }

 //3 lastSong
 public void computeLast(){
  for(int i = 0; i < song.length; i++){

   }
  System.out.println("The first song is:"+song[length-1]);
  }

 //4 average rating
 public void computeAvg(){
  sum = 0;
  for(int i = 0; i < rating.length; i++){
   sum = sum + rating;
  }
  average = sum / rating.length;
  System.out.println("The average rating is: "+average);

  }
  */

    //5 find the max
    public void compute(){
        int[] rating = new int[10];
        int max = rating [0];
        for(int i = 0; i < rating.length; i++){
            if(rating[i] > max){
                max = rating[i];
            }
            //Song s = Song.get(i);
            System.out.println("The max rating song is: ");
            //System.out.println("Song title: "+s.getSongTitle()+" , Singer: "+s.getSinger()+" ,Rating: "+s.getRating());

        }




    }//compute
}//class

