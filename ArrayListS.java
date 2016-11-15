import java.util.Arrays;
import java.lang.String;

public class ArrayListS extends java.lang.Object implements ListS {
    private String[] arrayListS;
    private boolean isFull;
    private int last = 0;
    
    public ArrayListS() {
        this.arrayListS = new String[10];
        last = 0;
    }
    
    public ArrayListS(int size) {
        arrayListS = new String[size];
    }
    
    public boolean add(String data) {
        if (isFull) 
            this.dblSize();
        arrayListS[last] = data;
        last++;
        check();
        return true;
    }
    
    public boolean add(int index, String data) {
        String temp = "";
        if (isFull)
            this.dblSize();
        temp = arrayListS[index];
        arrayListS[index] = data;
        index++;
        for(int i = index; i < last; i++) {
            data = arrayListS[i];
            arrayListS[i] = temp;
            temp = data;
        }
        last++; 
        check();
        return true;
    }
    
    private void check() {
        if (last == arrayListS.length) {
            isFull = true;
        }
    }
    
    public void clear() {
        this.arrayListS = new String[last];
        last = 0;
    }
    
    public boolean contains(String data) {
        if (this.indexOf(data) == -1) {
            return false;
        }
        return true;
    }
    
    private void dblSize() {
        String[] newArray = new String[last * 2];
        for (int i = 0; i < last; i++) {
            newArray[i] = this.arrayListS[i];
        }
        arrayListS = newArray;
    }
    
    public String get(int index) {
        return arrayListS[index];
    }
    
    public void set(int index, String value) {
        arrayListS[index] = value;
    }
    
    public int indexOf(String data) {
        for (int i = 0; i < last; i++) {
            if (data.compareTo(arrayListS[i]) == 0) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean isEmpty() {
        if (last == 0) {
            return true;
        }
        return false;
    }
    
    public void trimToSize() {
        String[] result = new String[last];
        for (int i = 0; i < last; i++) {
            result[i] = arrayListS[i];  
        }
        arrayListS = result;
    }
    
    public int size() {
        return this.last;
    }
    
    public void remove(int index) {
        for (int i = index; i < last - 1; i++) {
            this.arrayListS[i] = this.arrayListS[i+1];
        }
        arrayListS[last-1] = null;
    }
    
    @Override
    public String toString() {
        String out = "[";
        for (int i = 0; i < last - 1; i++) {
            out += arrayListS[i] + ", ";
        }
        out += arrayListS[last - 1] + "]";
        return out;
    }
}