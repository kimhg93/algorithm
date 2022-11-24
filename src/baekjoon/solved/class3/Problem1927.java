package baekjoon.solved.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 */
public class Problem1927 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        int cnt = Integer.parseInt(r.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<cnt; i++){
            int num = Integer.parseInt(r.readLine());
            if(num != 0) pq.add(num);
            else {
                if(pq.size() > 0) sb.append(pq.poll()).append("\n");
                else sb.append(0).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}


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

class MinHeap extends Heap{
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

class MaxHeap extends Heap{
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


/*

최소 힙
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초 (추가 시간 없음) (하단 참고)	128 MB	52967	24627	19376	48.690%
문제
널리 잘 알려진 자료구조 중 최소 힙이 있다. 최소 힙을 이용하여 다음과 같은 연산을 지원하는 프로그램을 작성하시오.

배열에 자연수 x를 넣는다.
배열에서 가장 작은 값을 출력하고, 그 값을 배열에서 제거한다.
프로그램은 처음에 비어있는 배열에서 시작하게 된다.

입력
첫째 줄에 연산의 개수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 N개의 줄에는 연산에 대한 정보를 나타내는 정수 x가 주어진다. 만약 x가 자연수라면 배열에 x라는 값을 넣는(추가하는) 연산이고, x가 0이라면 배열에서 가장 작은 값을 출력하고 그 값을 배열에서 제거하는 경우이다. x는 231보다 작은 자연수 또는 0이고, 음의 정수는 입력으로 주어지지 않는다.

출력
입력에서 0이 주어진 횟수만큼 답을 출력한다. 만약 배열이 비어 있는 경우인데 가장 작은 값을 출력하라고 한 경우에는 0을 출력하면 된다.

예제 입력 1
9
0
12345678
1
2
0
0
0
0
32
예제 출력 1
0
1
2
12345678
0

 */