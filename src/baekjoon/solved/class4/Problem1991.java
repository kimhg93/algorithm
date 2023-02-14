package baekjoon.solved.class4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem1991 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws Exception {
        int n = Integer.parseInt(r.readLine());
        String[][] arr = new String[n][3];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(r.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
        }

        List<Node1991> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            Node1991 a = find(list, arr[i][0]);
            if(null == a) a = new Node1991(arr[i][0]);
            Node1991 b = new Node1991(arr[i][1]);
            Node1991 c = new Node1991(arr[i][2]);

            if(!".".equals(b.getData())){
                a.addLeft(b);
            }
            if(!".".equals(c.getData())){
                a.addRight(c);
            }
            list.add(a);
            if(a.getLeft() != null) list.add(b);
            if(a.getRight() != null) list.add(c);
        }

        String preOrder = preOrder(list.get(0), new StringBuilder());
        String inOrder = inOrder(list.get(0), new StringBuilder());
        String postOrder = postOrder(list.get(0), new StringBuilder());

        System.out.println(preOrder);
        System.out.println(inOrder);
        System.out.println(postOrder);

    }

    public static Node1991 find(List<Node1991> list, String data){
        for(int i=0; i<list.size(); i++){
            if(null != list.get(i).getData()){
                if(list.get(i).getData().equals(data)){
                    return list.get(i);
                }
            }
        }
        return null;
    }

    public static String preOrder(Node1991 node, StringBuilder sb){
        if(node != null){
            sb.append(node.data);
            preOrder(node.left, sb);
            preOrder(node.right, sb);
        }
        return sb.toString();
    }

    public static String inOrder(Node1991 node, StringBuilder sb){
        if(node != null){
            inOrder(node.left, sb);
            sb.append(node.data);
            inOrder(node.right, sb);
        }
        return sb.toString();
    }

    public static String postOrder(Node1991 node, StringBuilder sb){
        if(node != null){
            postOrder(node.left, sb);
            postOrder(node.right, sb);
            sb.append(node.data);
        }
        return sb.toString();
    }
}

class Node1991 {
    String data;
    Node1991 left;
    Node1991 right;

    public Node1991(String data){
        this.data = data;
        left = null;
        right = null;
    }

    public Node1991(String data, Node1991 left, Node1991 right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public void addLeft(Node1991 node){
        this.left = node;
    }

    public void addRight(Node1991 node){
        this.right = node;
    }

    public Node1991 getLeft(){
        return left;
    }

    public Node1991 getRight(){
        return right;
    }

    public String getData() {
        return data;
    }
}
/*
트리 순회

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	41967	27401	20908	66.272%
문제
이진 트리를 입력받아 전위 순회(preorder traversal), 중위 순회(inorder traversal)
, 후위 순회(postorder traversal)한 결과를 출력하는 프로그램을 작성하시오.

예를 들어 위와 같은 이진 트리가 입력되면,

전위 순회한 결과 : ABDCEFG // (루트) (왼쪽 자식) (오른쪽 자식)
중위 순회한 결과 : DBAECFG // (왼쪽 자식) (루트) (오른쪽 자식)
후위 순회한 결과 : DBEGFCA // (왼쪽 자식) (오른쪽 자식) (루트)
가 된다.

입력
첫째 줄에는 이진 트리의 노드의 개수 N(1 ≤ N ≤ 26)이 주어진다. 둘째 줄부터 N개의 줄에 걸쳐 각 노드와 그의 왼쪽 자식 노드,
오른쪽 자식 노드가 주어진다. 노드의 이름은 A부터 차례대로 알파벳 대문자로 매겨지며,
항상 A가 루트 노드가 된다. 자식 노드가 없는 경우에는 .으로 표현한다.

출력
첫째 줄에 전위 순회, 둘째 줄에 중위 순회, 셋째 줄에 후위 순회한 결과를 출력한다. 각 줄에 N개의 알파벳을 공백 없이 출력하면 된다.

예제 입력 1
7
A B C
B D .
C E F
E . .
F . G
D . .
G . .
예제 출력 1
ABDCEFG
DBAECFG
DBEGFCA
 */

