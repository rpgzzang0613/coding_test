import programmers.ProgrammersQuizFactory;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args)
            throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

//        Baekjun baekjun = new Baekjun();
//        baekjun.execute();

//        프로그래머스
        String quizName;

//        quizName = "달리기_경주";
//        quizName = "추억_점수";
//        quizName = "공원_산책";
//        quizName = "바탕화면_정리";
//        quizName = "덧칠하기";
//        quizName = "대충_만든_자판";
//        quizName = "카드_뭉치";
//        quizName = "문자열_내_p와_y의_개수";
//        quizName = "문자열을_정수로_바꾸기";
//        quizName = "자릿수_더하기";
//        quizName = "자연수_뒤집어_배열로_만들기";
//        quizName = "정수_내림차순으로_배치하기";
//        quizName = "정수_제곱근_판별";
//        quizName = "하샤드_수";
//        quizName = "두_정수_사이의_합";
//        quizName = "나머지가_1이_되는_수_찾기";
//        quizName = "x만큼_간격이_있는_n개의_숫자";
//        quizName = "서울에서_김서방_찾기";
//        quizName = "콜라츠_추측";
//        quizName = "음양_더하기";
//        quizName = "없는_숫자_더하기";
//        quizName = "나누어_떨어지는_숫자_배열";
//        quizName = "제일_작은_수_제거하기";
//        quizName = "핸드폰_번호_가리기";
//        quizName = "내적";
//        quizName = "가운데_글자_가져오기";
//        quizName = "수박수박수박수박수박수";
//        quizName = "약수의_개수와_덧셈";
//        quizName = "문자열_내림차순으로_배치하기";
//        quizName = "부족한_금액_계산하기";
//        quizName = "문자열_다루기_기본";
//        quizName = "행렬의_덧셈";
//        quizName = "최대공약수와_최소공배수";
//        quizName = "같은_숫자는_싫어";
//        quizName = "예산";
//        quizName = "삼진법_뒤집기";
//        quizName = "크기가_작은_부분_문자열";
//        quizName = "이상한_문자_만들기";
//        quizName = "삼총사";
//        quizName = "최소직사각형";
//        quizName = "시저_암호";
//        quizName = "콜라_문제";
//        quizName = "명예의_전당_1";
//        quizName = "문자열_내_마음대로_정렬하기";
//        quizName = "비밀지도_1차";
//        quizName = "폰켓몬";
//        quizName = "기사단원의_무기";
//        quizName = "_2016년";
//        quizName = "모의고사";
//        quizName = "과일_장수";
//        quizName = "지폐_접기";
//        quizName = "소수_만들기";
//        quizName = "소수_찾기";
//        quizName = "옹알이_2";
//        quizName = "실패율";
//        quizName = "둘만의_암호";
//        quizName = "이웃한_칸";
//        quizName = "문자열_나누기";
//        quizName = "다트게임_1차";
//        quizName = "로또의_최고_순위와_최저_순위";
//        quizName = "완주하지_못한_선수";
//        quizName = "체육복";
//        quizName = "햄버거_만들기";
//        quizName = "숫자_짝꿍";
//        quizName = "데이터_분석";
//        quizName = "크레인_인형뽑기_게임";
//        quizName = "성격_유형_검사하기";
//        quizName = "키패드_누르기";
//        quizName = "신규_아이디_추천";
//        quizName = "개인정보_수집_유효기간";
        quizName = "유연근무제";

        ProgrammersQuizFactory.create(quizName)
                .execute();
    }

}
