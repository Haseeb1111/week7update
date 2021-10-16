public abstract class HostelManagementSystem {
    int Roomnumber;
    SizeAdapter size;

    abstract void setRoomnumber(int Roomnumber);

    public int calculateBill(int units){
        return units*Roomnumber;
    }
}