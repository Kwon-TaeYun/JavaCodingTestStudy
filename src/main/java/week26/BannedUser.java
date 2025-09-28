package week26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BannedUser {
    public static Set<Set<String>> result = new HashSet<>();
    public static int solution(String[] user_id, String[] banned_id) {
        int answer = 0;
        List<List<String>> candidates = new ArrayList<>();
        for (String banned : banned_id) {
            List<String> temp = new ArrayList<>();
            for (String user :user_id) {
                if(matches(user, banned)){
                    temp.add(user);
                }
            }
            candidates.add(temp);
        }
        backtrack(candidates, 0, new HashSet<>());

        return result.size();
    }

    public static void backtrack(List<List<String>> candidates, int idx, Set<String> path){
        if(idx == candidates.size()){
            result.add(new HashSet<>(path));
            return;
        }

        for (String s : candidates.get(idx)) {
            if(!path.contains(s)) {
                path.add(s);
                backtrack(candidates, idx + 1, path);
                path.remove(s);
            }
        }
    }

    public static boolean matches(String user_id, String banned_id){
        if(user_id.length() != banned_id.length()) return false;
        for(int i = 0; i < user_id.length(); i++){
            if(banned_id.charAt(i) != '*' && banned_id.charAt(i) != user_id.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
        String[] banned_id = {"fr*d*", "abc1**"};
        System.out.println(solution(user_id, banned_id));
    }
}
