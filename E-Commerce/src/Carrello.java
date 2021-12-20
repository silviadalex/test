
public class Carrello {
private int amount;
public Carrello() {
	amount=0;

}
public int getamount() {
	return amount;
}
public void insertOneProduct() {
	amount++;
	
}
public void removeOneProduct() {
	if (amount >0)
	amount --;
}
}


