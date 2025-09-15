package week24;

public class RecentSong {
    public static String replaceSharp(String s){
        s = s.replaceAll("C#", "c");
        s = s.replaceAll("D#", "d");
        s = s.replaceAll("F#", "f");
        s = s.replaceAll("G#", "g");
        s = s.replaceAll("A#", "a");
        return s;
    }

    public static int changeTime(String time){
        String[] token = time.split(":");
        return Integer.parseInt(token[0]) * 60 + Integer.parseInt(token[1]);
    }

    public static String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        m = replaceSharp(m);
        int maxTime = -1;
        for(int i = 0; i < musicinfos.length; i++){
            String[] token = musicinfos[i].split(",");
            int startTime = changeTime(token[0]);
            int endTime = changeTime(token[1]);
            String title = token[2];
            String melody = replaceSharp(token[3]);

            int time = endTime - startTime;
            StringBuilder played = new StringBuilder();
            for(int j = 0; j < time; j++){
                played.append(melody.charAt(j % melody.length()));
            }

            if(played.toString().contains(m)){
                if(time > maxTime) {
                    maxTime = time;
                    answer = title;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] musicInfos = {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        System.out.println(solution("ABCDEFG", musicInfos));
    }
}
