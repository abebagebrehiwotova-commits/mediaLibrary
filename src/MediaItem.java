import java.util.ArrayList;
import java.util.Scanner;

public class MediaItem {

String name;
String category;
String genre;
String note;



static ArrayList<MediaItem>itemList = new ArrayList<>();
static Scanner scanner=new Scanner(System.in);

public static void addMedia(){
MediaItem item= new MediaItem();
System.out.println("MediaTitle: ");
item.name=scanner.nextLine();
System.out.println();
  System.out.println("Pick a category:");
  System.out.println("1.Movie & series");
  System.out.println("2.Book & article");
  System.out.println("3.music");
  System.out.println("4.Person & Character");
  int categoryChoice=scanner.nextInt();
  switch(categoryChoice){
      case 1:
          item.category="Movie & series";
          System.out.println("Category:Movie & series");
          break;
      case 2:
          item.category="Book & article";
          System.out.println("Category:Book & article");
          break;
      case 3:
          item.category="music";
          System.out.println("Category:music");
          break;
      case 4:
          item.category="Person & Character";
          System.out.println("Category:Person & Character");
          break;
  }
    System.out.println();
System.out.println("pick a genre:");
System.out.println("1.light");
System.out.println("2.dark");
int genreChoice=scanner.nextInt();
scanner.nextLine();
switch(genreChoice){
    case 1:
        item.genre="light";
        System.out.println("Genre:light");
        break;
    case 2:
        item.genre="dark";
        System.out.println("Genre:dark");
}
    System.out.println();
    System.out.println("note:");
    item.note=scanner.nextLine();
System.out.println("add "+item.name+" to archive");
itemList.add(item);
    System.out.println();
}

public static void listMedia(){
for (int i=0;i<itemList.size();i++){
System.out.println(itemList.get(i).name);
System.out.println(itemList.get(i).category);
System.out.println(itemList.get(i).genre);
System.out.println(itemList.get(i).note);
System.out.println();}
}
public static void removeMedia(){
System.out.println("media to be removed: ");
String mediaToRemove=scanner.nextLine();
for(int i =0;i<itemList.size();i++){
if(itemList.get(i).name.equals(mediaToRemove)){
itemList.remove(i);}}}

}
