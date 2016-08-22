class Node{
    int key;
    int value;
    Node pre;
    Node next;
    public Node(int key, int value){
        this.key = key;
        this.value = value;
        this.pre = null;
        this.next = null;
    }
    
}
public class LRUCache {
    int capacity;
    HashMap<Integer, Node> map = new HashMap<Integer, Node>();
    Node head = null;
    Node tail = null;
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            remove(n);
            setHead(n);
            return n.value;
        }
        return -1;
    }
    
    public void set(int key, int value) {
        if(map.containsKey(key)){
            Node old = map.get(key);
            remove(old);
            setHead(old);
        }else{
            Node creat = new Node(key, value);
            if(map.size()>=capacity){
                map.remove(end.key);
                remove(end);
                setHead(creat);
            }else{
                setHead(creat);
            }
            
            map.put(key, created);
        }
    }
    private void remove(Node n){
        if(n.pre!=null){
            n.pre.next = n.next;
        }else{
            head = n.next;
        }
        if(n.next!=null){
            n.next.pre = n.pre;
        }else{
            tail = n.pre;
        }
    }
    private void setHead(Node n){
        n.next = head;
        n.pre = null;
        if(head!=null){
            head.pre = n;
        }
        head = n;
        if(tail == null ){
            tail = head;
        }
    }
}