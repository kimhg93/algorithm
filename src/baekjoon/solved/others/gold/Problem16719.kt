package baekjoon.solved.others.gold

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val str = readLine()!!
    val list: MutableList<Pair<String, Int>> = ArrayList()
    val arr: Array<String> = Array(str.length){""}

    for(i in str.indices){
        list.add(Pair(str[i].toString(), i))
    }
    val sb = StringBuilder()

    while(list.isNotEmpty()){
        val pq = PriorityQueue<Map<String, Any>> { o1, o2 -> (o1["str"] as String).compareTo(o2["str"] as String) }
        for(i in 0 until list.size) {
            val p = list[i]
            val temp = arr.copyOf()
            val idx = p.second
            temp[idx] = p.first
            pq.offer(mapOf("str" to temp.joinToString(""), "idx" to i))
        }
        val map = pq.poll()
        val p2 = list.removeAt(map["idx"] as Int)
        val idx = p2.second
        arr[idx] = p2.first
        sb.append(map["str"]).append("\n")
    }

    println(sb)
}

/*

ZOAC

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	2615	1352	1109	54.389%
문제
2018년 12월, 처음 시작하게 된 ZOAC의 오프닝을 맡은 성우는 누구보다 화려하게 ZOAC를 알리려 한다.
앞 글자부터 하나씩 보여주는 방식은 너무 식상하다고 생각한 성우는 문자열을 보여주는 새로운 규칙을 고안해냈다!
규칙은 이러하다. 아직 보여주지 않은 문자 중 추가했을 때의 문자열이 사전 순으로 가장 앞에 오도록 하는 문자를 보여주는 것이다.
예를 들어 ZOAC를 보여주고 싶다면, A → AC → OAC → ZOAC 순으로 보여주면 된다.
바쁜 성우를 위하여 이 규칙대로 출력해주는 프로그램을 작성하시오.

입력
첫 번째 줄에 알파벳 대문자로 구성된 문자열이 주어진다. 문자열의 길이는 최대 100자이다.

출력
규칙에 맞게 순서대로 문자열을 출력한다.

예제 입력 1
ZOAC
예제 출력 1
A
AC
OAC
ZOAC
예제 입력 2
BAC
예제 출력 2
A
AC
BAC
예제 입력 3
STARTLINK
예제 출력 3
A
AI
AIK
AINK
ALINK
ARLINK
ARTLINK
SARTLINK
STARTLINK
힌트
ZOAC는 한양대학교 ERICA 알고리즘 학회 ‘영과일’에서 주최하는 알고리즘 대회 Zero One Algorithm Contest 의 약자이다.

출처
University > 한양대학교 ERICA 캠퍼스 > Zero One Algorithm Contest 2018 A번

문제를 만든 사람: hellogaon
알고리즘 분류
구현
문자열
재귀
 */
