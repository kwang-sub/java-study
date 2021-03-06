package study.java.collection.searchcollection;

import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(87);
        scores.add(81);
        scores.add(85);
        scores.add(22);
        scores.add(83);

        Integer score = null;

        score = scores.first();
        System.out.println("가장 낮은 점수 : " + score);

        score = scores.last();
        System.out.println(" 가장 높은 점수 : " + score);

        score = scores.lower(95);
        System.out.println(" 95점 아래 점수 : " + score);
        score = scores.higher(85);
        System.out.println("85점 이상 점수  : " + score);
        score = scores.floor(85);
        System.out.println(" 85점이거나 바로 아래점수 : " + score);
        score = scores.ceiling(87);
        System.out.println(" 87점이거나 바로 위의 점수 : " + score);

        while (!scores.isEmpty()){
            score = scores.pollFirst();
            System.out.println(score + " 남은 객체수 : " + scores.size() );
        }
    }
}
