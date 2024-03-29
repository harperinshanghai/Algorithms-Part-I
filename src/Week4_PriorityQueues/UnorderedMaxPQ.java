package Week4_PriorityQueues;

import static ElementarySorts.Selection.exch;
import static ElementarySorts.Selection.less;

public class UnorderedMaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N;
    public UnorderedMaxPQ(int capacity){
        pq = (Key[]) new Comparable[capacity];
    }

    public boolean isEmpty(){return N == 0;}

    public void insert(Key x){pq[N++] = x;}

    public Key delMax(){
        int max = 0;
        for (int i = 1; i < N; i++)
            if (less(max, i)) max = i;
        exch(pq, max, N-1);
        return pq[--N];
    }
}
