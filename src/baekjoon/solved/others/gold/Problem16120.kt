package baekjoon.solved.others.gold

fun main() {
    val str = readLine()!!
    var cnt = 0
    var i = 0
    var flag = true

    while (i < str.length) {
        if (str[i] == 'P') {
            cnt++
            i++
        } else if (str[i] == 'A') {
            if (i + 1 < str.length && str[i + 1] == 'P' && cnt >= 2) {
                cnt--
                i += 2
            } else {
                flag = false
                break
            }
        } else {
            flag = false
            break
        }
    }

    if (cnt == 1 && flag) println("PPAP")
    else println("NP")
    
}



/*

PPAP

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초 (추가 시간 없음)	512 MB	10765	3453	2601	31.005%
문제
bryan은 PPAP를 좋아한다. bryan은 어떻게 하면 사람들에게 PPAP를 전파할 수 있을까 고민하던 중 PPAP 문자열이라는 것을 고안하게 되었다.

PPAP 문자열은 문자열 P에서 시작하여, 문자열 내의 P를 PPAP로 바꾸는 과정을 반복하여 만들 수 있는 문자열로 정의된다. 정확하게는 다음과 같이 정의된다.

P는 PPAP 문자열이다.
PPAP 문자열에서 P 하나를 PPAP로 바꾼 문자열은 PPAP 문자열이다.
예를 들어 PPAP는 PPAP 문자열이다. 또한, PPAP의 두 번째 P를 PPAP로 바꾼 PPPAPAP 역시 PPAP 문자열이다.

문자열이 주어졌을 때, 이 문자열이 PPAP 문자열인지 아닌지를 알려주는 프로그램을 작성하여라.

입력
첫 번째 줄에 문자열이 주어진다. 문자열은 대문자 알파벳 P와 A로만 이루어져 있으며, 문자열의 길이는 1 이상 1,000,000 이하이다.

출력
첫 번째 줄에 주어진 문자열이 PPAP 문자열이면 PPAP를, 아닌 경우 NP를 출력한다.

예제 입력 1
PPPAPAP
예제 출력 1
PPAP
예제 입력 2
PPAPAPP
예제 출력 2
NP
출처
University > 서울대학교 > 2018 서울대학교 프로그래밍 경시대회 > Division 1 C번
University > 서울대학교 > 2018 서울대학교 프로그래밍 경시대회 > Division 2 G번

문제를 만든 사람: cozyyg
데이터를 추가한 사람: lambda, leeholeo
알고리즘 분류
자료 구조
문자열
스택

*/
