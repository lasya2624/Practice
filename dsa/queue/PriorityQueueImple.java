class MyQueue{
    int heap[] = new int[10];
    int size = 0;
    int current = 0;

    void insert(int val){
        heap[size] = val;
        current = size ;
        size++;

        while(current > 0){
            int parent = (current - 1)/2;

            if(heap[parent] > heap[current]){
                int temp = heap[parent];
                heap[current] = heap[parent];
                heap[parent] = temp;
                current = parent;
            }
            else{
                break;
            }
        }
    }
    int remove(){
        if(size == 0){
            return -1;
        }
        int current = 0;
        int smallest = 0;
        int min = heap[0];
        heap[0] = heap[size]-1;
        size--;
    while(true){
            int left = 2*current +1;
            int right = 2*current + 2;
            if(heap[left] < heap[smallest] && left < size ){
                smallest = left;
            }
            if(heap[right] < heap[smallest] && right < size ){
                smallest = right;
            }
            if(smallest == current){
                break;
            }

            int temp = heap[current];
            heap[current] = heap[smallest];
            heap[smallest] = temp;

            current = smallest;
        }
        return min;
    }
    void print(){
        for(int i=0;i<size;i++){
            System.out.print(heap[i] + " ");
        }
    }
}
public class PriorityQueueImple {
    public static void main(String[] args){
        MyQueue q = new MyQueue();
        q.insert(4);
        q.insert(15);
        q.insert(10);
        q.insert(2);
        q.insert(3);

        System.out.println(q.remove());

        q.print();
    }
    
}
