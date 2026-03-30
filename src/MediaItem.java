import java.util.ArrayList;
import java.util.Scanner;

public class MediaItem {

String name;

static ArrayList<MediaItem>itemList = new ArrayList<>();
static Scanner scanner=new Scanner(System.in);

public static void addMedia(){
MediaItem item= new MediaItem();
System.out.println("MediaTitle: ");
item.name=scanner.nextLine();
System.out.println("add"+item.name);
itemList.add(item);
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
