package src.datastructures.doublelinkedlist;

public class DoubleLinkedListExample<T> {
    private class DoubleNode{
        T elem;
        DoubleNode prev;
        DoubleNode next;
    }
    private int size;
    private DoubleNode head;
    private DoubleNode last;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void insertAtTheBeginning(T elem){
        DoubleNode oldFirst=head;

        head=new DoubleNode();
        head.elem=elem;
        head.next=oldFirst;

        if(oldFirst!=null){
            oldFirst.prev=head;
        }

        if(isEmpty()){
            last=head;
        }

        size++;
    }

    public void insertAtTheEnd(T elem){
        DoubleNode oldLast=last;

        last=new DoubleNode();
        last.elem=elem;
        last.prev=oldLast;

        if(oldLast!=null){
            oldLast.next=last;
        }

        if(isEmpty()){
            head=last;
        }
        size++;
    }

    public void insertBeforeNode(T beforeItem,T item){
        if(isEmpty())
            return;

        DoubleNode current=head;
        while(current!=null){
            if(current.elem.equals(beforeItem))
                break;
            current=current.next;
        }

        if(current!=null){
            DoubleNode newNode=new DoubleNode();
            newNode.elem=item;

            DoubleNode prevNode=current.prev;
            current.prev=newNode;
            newNode.next=current;
            newNode.prev=prevNode;

            if(newNode.prev==null){
                head=newNode;
            }else{
                prevNode.next=newNode;
            }
            size++;
        }
    }

    public void insertAfterNode(T afterNode,T item){
        if(isEmpty())
            return;
        DoubleNode current=head;
        while(current!=null){
            if(current.elem.equals(afterNode))
                break;
            current=current.next;
        }

        if(current!=null){
            DoubleNode newNode=new DoubleNode();
            newNode.elem=item;

            DoubleNode nextNode=current.next;
            current.next=nextNode;
            newNode.prev=current;
            newNode.next=nextNode;
            if(newNode.next==null){
                last=newNode;
            }else{
                nextNode.prev=newNode;
            }
            size++;
        }
    }

    public T removeFromTheBeginning(){
        if(isEmpty())
            return null;
        T elem=head.elem;
        if(head.next!=null){
            head.next.prev=null;
        }else{
            last=null;
        }
        head=head.next;
        size--;
        return elem;
    }

    public T removeFromTheEnd(){
        if(isEmpty())
            return null;
        T temp=last.elem;
        if(last.prev!=null){
            last.prev.next=null;
        }else{
            head=null;
        }
        last=last.prev;
        size--;
        return temp;
    }

    public T removeItemWithIndex(int nodeIndex){
        if(isEmpty() ||nodeIndex<=0 || nodeIndex>size())
            return null;

        boolean startFromTheBeginning=nodeIndex <= size() / 2;
        int index=startFromTheBeginning ? 1 : size;
        DoubleNode current=startFromTheBeginning ? head : last;

        while(current !=null){
            if(nodeIndex==index)
                break;
            if(startFromTheBeginning){
                index++;
            }else{
                index--;
            }
            current=startFromTheBeginning ? current.next : current.prev;
        }

        T elem = current.elem;

        DoubleNode prev = current.prev;
        DoubleNode next=current.next;

        if(prev!=null)
            prev.next=next;
        if(next!=null)
            next.prev=prev;
        if(current == head)
            head=next;
        if(current==last)
            last=prev;
        size--;
        return elem;
    }
}
