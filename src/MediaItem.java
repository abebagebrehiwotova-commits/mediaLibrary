import java.util.ArrayList;
import java.util.Scanner;

public class MediaItem {

String name;
String category;
String genre;


static ArrayList<MediaItem>itemList = new ArrayList<>();
static Scanner scanner=new Scanner(System.in);

public static void addMedia(){
MediaItem item= new MediaItem();
System.out.println("MediaTitle: ");
item.name=scanner.nextLine();
System.out.println("Pick a category: ");
System.out.println("1.Movie&series/2.Book&article/3.music/4.Person&Character");
int categoryChoice=scanner.nextInt();
if(categoryChoice==1){
item.category="Movie&series";
System.out.println("Category:Movie&series");
}
else if(categoryChoice==2){
item.category="Book&article";
System.out.println("Category:Book&article");
}
else if(categoryChoice==3){
item.category="music";
System.out.println("Category:music");
}
else if(categoryChoice==4){
item.category="Person&Character";
System.out.println("Category:Person&Character");
}
System.out.println("add "+item.name+" to archive");
itemList.add(item);
System.out.println("pick a genre:");
System.out.println("1.light/2.dark");
int genreChoice=scanner.nextInt();
if(genreChoice==1){
item.genre="light";
System.out.println("Genre:light");
}
else if(genreChoice==2){
item.genre="dark";
System.out.println("Genre:dark");
}

}

public static void listMedia(){
for (int i=0;i<itemList.size();i++){
System.out.println(itemList.get(i).name);}
}
public static void removeMedia(){
System.out.println("media to be removed: ");
String mediaToRemove=scanner.nextLine();
for(int i =0;i<itemList.size();i++){
if(itemList.get(i).name.equals(mediaToRemove)){
itemList.remove(i);}}}

}
