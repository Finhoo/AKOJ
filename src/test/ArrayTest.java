package test;

/**
 * Created by fan on 2017/7/15.
 */
public class ArrayTest {
    private int []content;
    private int index;
    public void add(int element) {
        if (index == 0) {
            content = new int[1+index];
            content[index] = element;
        }else {
            int temp[] = new int[index+1];
            for (int i = 0; i < index; i++) {
                temp[i] = content[i];
            }
            temp[index] = element;
            content = new int[index+1];
            content = temp.clone();
        }
        index++;
    }

    public int find(int element) {
        for (int j = 0; j < this.size(); j++) {
            if (this.content[j] == element)
                return j;
        }
        return -1;
    }

    public void set(int oldElement, int newElement) {
        for (int i = 0; i < this.size(); i++) {
            if (this.content[i] == oldElement)
                this.content[i] = newElement;
        }
    }

    public void delete(int element) {
        int i = 0;
        for (i = 0; i < this.size(); i++)
                if (this.content[i] == element)
                    break;
        for (int j = i; j < this.size()-1; j++) {
            this.content[j] = this.content[j+1];
        }
        index--;
    }
    public int size(){
        return index;
    }
    public static void main(String[] args) {
        ArrayTest test = new ArrayTest();
        test.add(3);
        test.add(4);
        test.add(5);
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.content[i]);
        }
    }
}
