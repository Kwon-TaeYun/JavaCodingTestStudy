package week23;

public class VideoPlayer {
    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        // 1. video_len 분리 (MM:SS → 분, 초)
        String[] videoLenParts = video_len.split(":");
        int videoLenMin = Integer.parseInt(videoLenParts[0]);
        int videoLenSec = Integer.parseInt(videoLenParts[1]);

        // 2. pos 분리 (현재 위치 MM:SS → 분, 초)
        String[] posParts = pos.split(":");
        int posMin = Integer.parseInt(posParts[0]);
        int posSec = Integer.parseInt(posParts[1]);

        // 3. op_start 분리 (반복 시작 MM:SS → 분, 초)
        String[] opStartParts = op_start.split(":");
        int opStartMin = Integer.parseInt(opStartParts[0]);
        int opStartSec = Integer.parseInt(opStartParts[1]);

        // 4. op_end 분리 (반복 종료 MM:SS → 분, 초)
        String[] opEndParts = op_end.split(":");
        int opEndMin = Integer.parseInt(opEndParts[0]);
        int opEndSec = Integer.parseInt(opEndParts[1]);

        int posSeconds = posMin * 60 + posSec;
        int videoSeconds = videoLenMin * 60 + videoLenSec;
        int opStartSeconds = opStartMin * 60 + opStartSec;
        int opEndSeconds = opEndMin * 60 + opEndSec;

        if(posSeconds >= opStartSeconds && posSeconds <= opEndSeconds){
            posSeconds = opEndSeconds;
        }

        for (String command : commands) {
            if(command.equals("next")){
                posSeconds+=10;
                if(posSeconds > videoSeconds){
                    posSeconds = videoSeconds;
                }

            }else{
                posSeconds-=10;
                if(posSeconds < 0){
                    posSeconds = 0;
                }
            }

            if(posSeconds >= opStartSeconds && posSeconds < opEndSeconds){
                posSeconds = opEndSeconds;
            }
        }
        String result = String.format("%02d:%02d", posSeconds / 60, posSeconds % 60);
        return result;
    }

    public static void main(String[] args) {
        String solution = solution("34:33", "13:00", "00:55", "02:55", new String[]{"next", "prev"});
        System.out.println(solution);

    }
}
