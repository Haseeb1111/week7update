/**
 * This class implements the factory design pattern
 */

public class wHostelManagementSystemFactory {
    public HostelManagementSystem getItem(String item, String size){
        if(item == null){
            return null;
        }
        if(item.equalsIgnoreCase("Warden")) {
            HostelManagementSystem g= new Warden();
            ((Warden) g).selectSize(size);
            return g;
        }
        else if(item.equalsIgnoreCase("Food")){
            HostelManagementSystem g= new Food();
            ((Food) g).selectSize(size);
            return g;
        }
        else if(item.equalsIgnoreCase("Cleaning")) {
            HostelManagementSystem g= new Cleaning();
            ((Cleaning) g).selectSize(size);
            return g;
        }
        return null;
    }
}
