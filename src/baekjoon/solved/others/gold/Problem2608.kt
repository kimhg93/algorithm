package baekjoon.solved.others.gold

import java.lang.StringBuilder

fun main() {
    val str1 = readLine()!!
    val str2 = readLine()!!
    val sb = StringBuilder()
    val map: HashMap<Char, Int> = hashMapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
    var sum = 0

    repeat(2) {
        val str = if(it == 0) str1 else str2
        for(i in str.indices){
            val num1 = map[str[i]]!!
            if(i+1 < str.length) {
                val num2 = map[str[i+1]]!!
                if(num2 > num1) sum -= num1*2
            }
            sum += num1
        }
    }
    sb.append(sum).append("\n")
    val num = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
    val str = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
    for (i in 0 until num.size) {
        while (sum >= num[i]) {
            sb.append(str[i])
            sum -= num[i]
        }
    }

    println(sb)
}

/*
로마 숫자

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	4245	1969	1676	50.421%
문제
로마 시대 때는 현재 사용하는 아라비아 숫자가 아닌 다른 방법으로 수를 표현하였다.

로마 숫자는 다음과 같은 7개의 기호로 이루어진다.

기호	I	V	X	L	C	D	M
  값	1	5	10	50	100	500	1000
수를 만드는 규칙은 다음과 같다.

보통 큰 숫자를 왼쪽에 작은 숫자를 오른쪽에 쓴다. 그리고 그 값은 모든 숫자의 값을 더한 값이 된다. 예를 들어 LX = 50 + 10 = 60 이 되고, MLI = 1000 + 50 + 1 = 1051 이 된다.
V, L, D는 한 번만 사용할 수 있고 I, X, C, M은 연속해서 세 번까지만 사용할 수 있다. 예를 들어 VV나 LXIIII 와 같은 수는 없다.
그리고 같은 숫자가 반복되면 그 값은 모든 숫자의 값을 더한 값이 된다. 예를 들어 XXX = 10 + 10 + 10 = 30 이 되고, CCLIII = 100 + 100 + 50 + 1 + 1 + 1 = 253 이 된다.
작은 숫자가 큰 숫자의 왼쪽에 오는 경우는 다음과 같다. IV = 4, IX = 9, XL = 40, XC = 90, CD = 400, CM = 900 을 나타낸다.
이들 각각은 한 번씩만 사용할 수 있다. 그런데 IV 와 IX 는 같이 쓸 수 없으며 XL 과 XC, CD 와 CM 또한 같이 쓸 수 없다.
이들 외에는 작은 숫자가 큰 숫자 왼쪽 어디에도 나올 수 없다. 예를 들어 XCXC 나 CMCD, VX 나 IIX 와 같은 수는 없다. 참고로 LIX = 50 + 9 = 59, CXC = 100 + 90 = 190 이 된다.
모든 수는 가능한 가장 적은 개수의 로마 숫자들로 표현해야 한다. 예를 들어 60 은 LX 이지 XLXX 가 아니고, 5 는 V 이지 IVI 가 아니다.
아래의 예를 참고 하시오.

DLIII = 500 + 50 + 3 = 553
MCMXL = 1000 + 900 + 40 = 1940
235 = CCXXXV
2493 = MMCDXCIII
로마 숫자로 이루어진 두 수를 입력받아 그 둘을 더한 값을 아라비아 숫자와 로마 숫자로 출력하는 프로그램을 작성하시오.

입력
첫째 줄과 둘째 줄에 하나씩 로마 숫자로 표현된 수가 주어진다. 입력된 각 수는 2000 보다 작거나 같고, 두 수의 합은 4000보다 작다.

출력
입력으로 주어진 두 수를 더한 값을 첫째 줄에 아라비아숫자로 출력하고 둘째 줄에는 로마 숫자로 출력한다.

예제 입력 1
DLIII
MCMXL
예제 출력 1
2493
MMCDXCIII
출처
Olympiad > 한국정보올림피아드 > 한국정보올림피아드시․도지역본선 > 지역본선 2004 > 초등부 5번

Olympiad > 한국정보올림피아드 > 한국정보올림피아드시․도지역본선 > 지역본선 2004 > 고등부 2번

잘못된 조건을 찾은 사람: chris2tg
빠진 조건을 찾은 사람: jh05013
알고리즘 분류
수학
구현
문자열
 */