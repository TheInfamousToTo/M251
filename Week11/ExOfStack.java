package Week11;

import java.util.ArrayList;

public class ExOfStack {
    private ArrayList<Object> list = new ArrayList<>();
    public boolean isEmpty()
    {
        if(list.size()== 0)
            return true;
        else
            return false;
    }
    public int getSize(){
        return list.size();
    }
    public void push(Object x)
    {list.add(x);}
    public Object pop()
    {
        Object x;
        if(!(list.isEmpty()))
        {
            x =list.remove(getSize()-1);
            return x;
        }
        else
            return "The Stack is empty";
    }
    /*public Object peek()
    {
        Object
    }
    public static void main(String[] args) {
      */

}
