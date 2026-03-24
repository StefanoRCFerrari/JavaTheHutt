package aula2303;
import java.util.LinkedList;

public class LisEnc {
    
    private LinkedList<Integer> lisEnc = new LinkedList<>();
    
    // Pure logic: takes a parameter, adds it to the list
    public void addElem(int num) {
        lisEnc.add(num);
    }
    
    public void remElem() {
        if (!lisEnc.isEmpty()) {
            lisEnc.removeFirst();
        }
    }
    
    public void showList() {
        for (int item : lisEnc) {
            System.out.println(item);
        }
    }
    
    public boolean checkVazia() {
        return lisEnc.isEmpty();
    }
}