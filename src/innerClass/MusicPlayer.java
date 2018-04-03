package innerClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()
public class MusicPlayer {
    private ArrayList<Album> albums;
    private LinkedList<Song> playList;

    public MusicPlayer() {
        albums = new ArrayList<Album>();
        playList = new LinkedList<Song>();
    }
    public void runMusicPlayer(){
        System.out.println("Music Player Started");
        Album markirtAlbum = new Album("Mankirt Aulakh");
        Album saeedBilalAlbum = new Album("Bilal Saeed");

        markirtAlbum.addSongToAlbum(new Song("Suit",3.5));
        markirtAlbum.addSongToAlbum(new Song("Badnaam",4.2));
        markirtAlbum.addSongToAlbum(new Song("Kadar",3.7));

        saeedBilalAlbum.addSongToAlbum(new Song("Bewafa",5.5));
        saeedBilalAlbum.addSongToAlbum(new Song("Kuku",4.3));
        saeedBilalAlbum.addSongToAlbum(new Song("2 No",2.5));

        albums.add(markirtAlbum);
        albums.add(saeedBilalAlbum);

        addSongToPlayList("Suit");
        addSongToPlayList("Kuku");
        addSongToPlayList("Kadar");
        addSongToPlayList("Badnaam");
        addSongToPlayList("Bewafa");
        addSongToPlayList("Mein tera Hero");

// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
        Scanner scanner = new Scanner(System.in);
        Boolean quit  = false;
        ListIterator<Song> songListIterator = playList.listIterator();
        Boolean forwardMoving = true;
        playList.size();
        System.out.println("Total songs in playList: "+ playList.size());
        while(!quit) {
            System.out.println("1. Quit \n" +
                    "2. Next Song \n" +
                    "3. Previous Song\n" +
                    "4. Replay Song");
            Integer option = scanner.nextInt();
            switch (option){
                case 1:
                    quit = true;
                    break;
                case 2:
                    if(!forwardMoving){
                        songListIterator.next();
                        forwardMoving = true;
                    }
                    if(songListIterator.hasNext()){
                        Song song = songListIterator.next();
                        playSong(song);
                    }
                    break;
                case 3:
                    if(forwardMoving){
                        songListIterator.previous();
                    }
                    if(songListIterator.hasPrevious()){
                        Song song = songListIterator.previous();
                        playSong(song);
                    }
                     break;
                case 4:
                     if(forwardMoving){
                         if(songListIterator.hasPrevious()){
                             Song song = songListIterator.previous();
                             playSong(song);
                         }else{
                             System.out.println("Play List Completed");
                         }

                     }else{
                         if(songListIterator.hasNext()){
                             Song song = songListIterator.next();
                             playSong(song);
                         }else{
                             System.out.println("Play List Completed");
                         }

                     }
              break;
            }
           // scanner.next();

        }










    }
    private void playSong(Song song){
        System.out.println("Album: "+ findAlbum(song).getName());
        System.out.println("Song: "+ song.getTitle());
        System.out.println("Duration: "+ song.getDuration());

    }
    private Album findAlbum(Song song){

        for(Album album: albums) {


           if(album.getSongs().contains(song)){
               return  album;
           }
        }
        return null;

    }

    private Song searchSong(String name){
        ArrayList<Song> songs;
        for(Album album: albums) {
            songs = album.getSongs();

            for (Song song : songs) {
                if (name.equals(song.getTitle())) {
                    return song;
                }
            }


        }
        return null;
    }

    private void  addSongToPlayList(String title){
        Song song = searchSong(title);
        addSong(song,title);
    }
    private void addSong(Song song, String title){
        if(song == null){
            System.out.println("Title "+ title+ " does not exist");
        }else{
            playList.add(song);
        }

    }



}
