import java.util.ArrayList;
import java.util.Scanner;

//Das ganze mit git verbinden,+JavaFX ready machen(1.Step erstmal "Figma" dummy entwerfen.giti).

public class Main {
    public static void main(String[] args) {



Scanner scanner= new Scanner(System.in);
ArrayList<MediaItem> itemList=new ArrayList<>();
int choice;


   do {

    System.out.println("1.add movie");
    System.out.println("2.remove movie");
    System.out.println("3.List of all movies");
    System.out.println("4.none");
    System.out.println("chose:");
    choice= scanner.nextInt();
    scanner.nextLine();


    if(choice==1){
        MediaItem.addMedia();}
    else if(choice==2){
        MediaItem.removeMedia();}
    else if (choice==3){
       MediaItem.listMedia();}


   }while(choice==1|choice==2|choice==3);}


    }
