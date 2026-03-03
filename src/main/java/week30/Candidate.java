package week30;

import java.util.*;

public class Candidate {
    public String solution(String[] votes, int k){
        String answer = " ";
        Map<String, HashSet<String>> voteHash = new HashMap<>();
        Map<String, Integer> candidate = new HashMap<>();
        Map<String, Integer> present = new HashMap<>();

        for (String vote : votes) {
            String[] v = vote.split(" ");
            String v1 = v[0];
            String v2 = v[1];
            voteHash.putIfAbsent(v1, new HashSet<String>());
            voteHash.get(v1).add(v2);
            candidate.put(v2, candidate.getOrDefault(v2, 0) + 1);
        }

        int max = 0;
        for (String vH : voteHash.keySet()) {
            int cnt = 0;
            for (String s : voteHash.get(vH)) {
                if(candidate.get(s) >= k){
                    cnt++;
                }
                present.put(vH, cnt);
                max = Math.max(max, cnt);
            }
        }

        List<String> aL = new ArrayList<>();
        for (String s : present.keySet()) {
            if(present.get(s) == max){
                aL.add(s);
            }
        }

        aL.sort((a,b)-> a.compareTo(b));

        return aL.get(0);
    }

    public static void main(String[] args){
        Candidate T = new Candidate();
        System.out.println(T.solution(new String[]{"john tom", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
        System.out.println(T.solution(new String[]{"john tom", "park luis", "john luis", "luis tom", "park tom", "luis john", "luis park", "park john", "john park", "tom john", "tom park", "tom luis"}, 2));
        System.out.println(T.solution(new String[]{"cody tom", "john tom", "cody luis", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
        System.out.println(T.solution(new String[]{"bob tom", "bob park", "park bob", "luis park", "daniel luis", "luis bob", "park luis", "tom bob", "tom luis", "john park", "park john"}, 3));
    }
}
