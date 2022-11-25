package structure;

/**
 * DFS
 */
public class Dfs {

    static int[] arr = {1,2,3,4,5,6,7,8,9};
    static boolean[] visited = new boolean[arr.length+1];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        dfs(8);
        System.out.println(sb);
    }

    public static void dfs(int x) {
        visited[x] = true;
        sb.append(x).append(" ");
        for (int i = 0; i < arr.length-1; i++) {
            if (!visited[arr[i]]){
                dfs(arr[i]);
            }
        }
    }
}
