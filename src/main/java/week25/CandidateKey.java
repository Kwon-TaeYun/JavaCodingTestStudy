package week25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CandidateKey {
    List<Set<Integer>> candidateKeys = new ArrayList<>();

    public int solution(String[][] relation) {
        int colSize = relation[0].length;
        for(int size = 1; size <= colSize; size++){
            combine(relation, new ArrayList<>(), 0, size, colSize);
        }

        return candidateKeys.size();
    }

    private void combine(String[][] relation, List<Integer> comb, int start, int r, int n){
        if(comb.size() == r){
            checkAndAdd(relation, comb);
            return;
        }

        for(int i = start; i < n; i++){
            comb.add(i);
            combine(relation, comb, i+1, r, n);
            comb.remove(comb.size() - 1);
        }
    }

    private void checkAndAdd(String[][] relation, List<Integer> comb){
        Set<String> seen = new HashSet<>();
        for(String[] row: relation){
            StringBuilder sb = new StringBuilder();
            for (Integer idx : comb) {
                sb.append(row[idx]).append("|");
            }
            if(!seen.add(sb.toString())) return;
        }

        Set<Integer> combSet  = new HashSet<>(comb);
        for (Set<Integer> ck : candidateKeys) {
            if(combSet.containsAll(ck)) return;
        }

        candidateKeys.add(combSet);
    }



    public static void main(String[] args) {
        CandidateKey sol = new CandidateKey();
        String[][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
        System.out.println(sol.solution(relation));
    }
}
