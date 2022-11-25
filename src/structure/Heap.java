package structure;

import java.util.ArrayList;
import java.util.List;

abstract class Heap{
    List<Integer> list = new ArrayList<>();

    abstract void add(int n);
    abstract int poll();
    public Heap(){
        this.list.add(Integer.MIN_VALUE);
    }
    public List<Integer> get(){
        return this.list;
    }
    public int get(int idx){
        return this.list.get(idx);
    }
    public String toString(){
        return this.list.subList(1, size()).toString();
    }
    public int size(){
        return this.list.size();
    }
    public void swap(int i1, int n1, int i2, int n2) {
        list.set(i1, n1);
        list.set(i2, n2);
    }
    public boolean compare(int n1, int n2, int type){
        if(type == -1) return n1 < n2;
        else return n1 > n2;
    }
    public int remove(int n){
        return list.remove(n);
    }
    public int maxIndex(){
        List<Integer> li;
        int max = Integer.MIN_VALUE;
        int idx = 0;
        li = new ArrayList<>(get());
        for(int i=0; i<li.size(); i++){
            int n = li.get(i);
            if(n > max){
                max = n;
                idx = i;
            }
        }
        if(li.size() > 0) return idx;
        else return 0;
    }
    // @pi parent index @pv parent value @ci child index @cv child value
    public void shiftDown(int pi, int t){
        while(pi*2 < size()){
            int pv = get(pi);
            int ci = pi*2;
            if (ci != size()-1 && compare(get(ci+1), get(ci), t)) ci++;
            int cv = get(ci);
            if(compare(cv, pv, t)) swap(ci, pv, pi, cv);
            else break;
            pi = ci;
        }
    }

    public void shiftUp(int ci, int t){
        int cv = get(ci);
        while(ci/2 > 0) {
            int pi = ci/2;
            int pv = get(pi);
            if (compare(cv, pv, t)) {
                swap(ci, pv, pi, cv);
                ci /= 2;
            } else break;
        }
    }

}

class MinHeap extends Heap {
    private int type = -1;
    @Override
    public void add(int n) {
        list.add(n);
        shiftUp(size()-1, type);
    }
    @Override
    public int poll() {
        int n = get(1);
        if(size() < 2 ) return 0;
        else if(size() == 2) return list.remove(size()-1);
        else list.set(1, list.remove(size()-1));
        shiftDown(1, type);
        return n;
    }
}

class MaxHeap extends Heap {
    private int type = 1;
    @Override
    public void add(int n) {
        list.add(n);
        shiftUp(size()-1, type);
    }
    @Override
    public int poll() {
        int n = get(1);
        if(size() < 2 ) return 0;
        else if(size() == 2) return list.remove(size()-1);
        else list.set(1, list.remove(size()-1));
        shiftDown(1, type);
        return n;
    }
}
