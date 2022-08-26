package baekjoon.step._9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem17478 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    private static int qcnt = 0;
    private static int acnt = 0;
    private static String p = "";


    public static void main(String[] args) throws Exception{
        int cnt = Integer.parseInt(r.readLine());
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        selfQ(cnt);
    }

    public static void selfQ(int cnt){
        System.out.println(p+"\"재귀함수가 뭔가요?\"");
        if(qcnt < cnt){
            System.out.println(p+"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
            System.out.println(p+"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
            System.out.println(p+"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
            qcnt++;
            p += "____";
            selfQ(cnt);
        } else {
            System.out.println(p+"\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            selfA(cnt);
        }


    }

    public static void selfA(int cnt){
        if(acnt < cnt){
            System.out.println(p+"라고 답변하였지.");
            p = p.substring(0, p.length()-4);
            acnt++;
            selfA(cnt);
        } else {
            System.out.println(p+"라고 답변하였지.");
        }
    }
}