package baekjoon.solved.class4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem5639 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        Node5639 root = new Node5639(-1);
        while(true){
            String str = r.readLine();
            if(str == null || str.isEmpty()) break;
            int n = Integer.parseInt(str);

            if(root.data() == -1) root = new Node5639(n);
            else {
                Node5639 cur = root;
                while(true){
                    if(cur.data() > n){
                        if(null == cur.left()) {
                            cur.addLeft(new Node5639(n, cur));
                            break;
                        } else  cur = cur.left();
                    } else {
                        if (null == cur.right()) {
                            cur.addRight(new Node5639(n, cur));
                            break;
                        } else cur = cur.right();
                    }
                }
            }
        }

        System.out.println(postOrder(root, sb));
    }

    public static String postOrder(Node5639 node, StringBuilder sb){
        if(node != null){
            postOrder(node.left(), sb);
            postOrder(node.right(), sb);
            sb.append(node.data()).append("\n");
        }
        return sb.toString();
    }

}

class Node5639 {
    Integer data;
    Node5639 parent;
    Node5639 left;
    Node5639 right;

    public Node5639(Integer data){
        this.data = data;
        left = null;
        right = null;
    }

    public Node5639(Integer data, Node5639 parent){
        this.data = data;
        this.parent = parent;
        left = null;
        right = null;
    }

    public void addLeft(Node5639 node){
        this.left = node;
    }

    public void addRight(Node5639 node){
        this.right = node;
    }

    public Node5639 left(){
        return left;
    }

    public Node5639 right(){
        return right;
    }

    public Integer data() {
        return data;
    }

    public Node5639 parent() {
        return parent;
    }

    public void setParent(Node5639 parent) {
        this.parent = parent;
    }
}
/*
이진 검색 트리 다국어

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	29445	11360	8007	37.712%
문제
이진 검색 트리는 다음과 같은 세 가지 조건을 만족하는 이진 트리이다.

노드의 왼쪽 서브트리에 있는 모든 노드의 키는 노드의 키보다 작다.
노드의 오른쪽 서브트리에 있는 모든 노드의 키는 노드의 키보다 크다.
왼쪽, 오른쪽 서브트리도 이진 검색 트리이다.


전위 순회 (루트-왼쪽-오른쪽)은 루트를 방문하고, 왼쪽 서브트리, 오른쪽 서브 트리를 순서대로 방문하면서 노드의 키를 출력한다.
후위 순회 (왼쪽-오른쪽-루트)는 왼쪽 서브트리, 오른쪽 서브트리, 루트 노드 순서대로 키를 출력한다.
예를 들어, 위의 이진 검색 트리의 전위 순회 결과는 50 30 24 5 28 45 98 52 60 이고, 후위 순회 결과는 5 28 24 45 30 60 52 98 50 이다.

이진 검색 트리를 전위 순회한 결과가 주어졌을 때, 이 트리를 후위 순회한 결과를 구하는 프로그램을 작성하시오.

입력
트리를 전위 순회한 결과가 주어진다. 노드에 들어있는 키의 값은 106보다 작은 양의 정수이다. 모든 값은 한 줄에 하나씩 주어지며,
노드의 수는 10,000개 이하이다. 같은 키를 가지는 노드는 없다.

출력
입력으로 주어진 이진 검색 트리를 후위 순회한 결과를 한 줄에 하나씩 출력한다.

예제 입력 1
50
30
24
5
28
45
98
52
60
예제 출력 1
5
28
24
45
30
60
52
98
50

 */

