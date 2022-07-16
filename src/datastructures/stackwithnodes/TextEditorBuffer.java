package src.datastructures.stackwithnodes;

public class TextEditorBuffer<T> {
    private class Node{
        T item;
        Node next;
    }

    private int sizeLeft;
    private int sizeRight;
    private Node firstLeftStack;
    private Node firstRightStack;

    public TextEditorBuffer() {
        sizeLeft=0;
        sizeRight=0;
        firstLeftStack=null;
        firstRightStack=null;
    }

    public void insert(T item){
        Node oldFirstLeft=firstLeftStack;
        firstLeftStack=new Node();
        firstLeftStack.item=item;
        firstLeftStack.next=oldFirstLeft;
        sizeLeft++;
    }

    private void insertOnRightStack(T item) {
        Node oldFirstRight = firstRightStack;
        firstRightStack = new Node();
        firstRightStack.item = item;
        firstRightStack.next = oldFirstRight;

        sizeRight++;
    }

    public T get(){
        if(sizeRight==0)
            return null;
        return firstRightStack.item;
    }

    //eleman silineceği zaman sağdaki stack'den çıkartılıyor.
    public T delete(){
        if(sizeRight==0)
            return null;
        T temp=firstRightStack.item;
        firstRightStack=firstRightStack.next;
        sizeRight--;
        return temp;
    }

    public void left(int k){
        int count=0;
        while(count<k && sizeLeft>0){
            T item=firstLeftStack.item;

            insertOnRightStack(item);
            firstLeftStack=firstLeftStack.next;
            sizeLeft--;
            count++;
        }
    }

    public void right(int k) {
        int count = 0;

        while (count < k && sizeRight > 0) {
            T item = firstRightStack.item;

            insert(item);

            firstRightStack = firstRightStack.next;
            sizeRight--;

            count++;
        }
    }

    public int size() {
        return sizeLeft + sizeRight;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Left Stack: ");
        for (Node current = firstLeftStack; current != null; current = current.next) {
            stringBuilder.append(current.item).append(" ");
        }

        stringBuilder.append("\nRight Stack: ");
        for (Node current = firstRightStack; current != null; current = current.next) {
            stringBuilder.append(current.item).append(" ");
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        TextEditorBuffer<Character> textEditorBuffer=new TextEditorBuffer<>();
        System.out.println("test insert");
        textEditorBuffer.insert('J');
        textEditorBuffer.insert('A');
        textEditorBuffer.insert('V');
        textEditorBuffer.insert('A');

        System.out.println(textEditorBuffer);

        textEditorBuffer.left(3);
        System.out.println(textEditorBuffer);
        textEditorBuffer.right(2);
        System.out.println(textEditorBuffer);
        System.out.println(textEditorBuffer.delete());
        System.out.println(textEditorBuffer);
    }
}
