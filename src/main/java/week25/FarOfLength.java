package week25;

public class FarOfLength {
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for(int k = 0; k < 5; k++){
            char[][] room = new char[5][5];
            for(int i = 0; i < 5; i++){
                room[i] = places[k][i].toCharArray();
            }

            boolean safe = true;
            for(int i = 0; i < 5 & safe; i++){
                for(int j = 0; j < 5 & safe; j++){
                    if(room[i][j] == 'P'){
                        if(j+1 < 5 && room[i][j+1] == 'P'){
                            safe = false;
                        }
                        if(j+2 < 5 && room[i][j+2] == 'P' && room[i][j+1] != 'X'){
                            safe = false;
                        }
                        if(i+1 < 5 && room[i+1][j] == 'P'){
                            safe = false;
                        }
                        if(i+2 < 5 && room[i+2][j] == 'P' && room[i+1][j] != 'X'){
                            safe = false;
                        }

                        //대각선
                        if (i + 1 < 5 && j + 1 < 5 && room[i + 1][j + 1] == 'P') {
                            if (room[i + 1][j] != 'X' || room[i][j + 1] != 'X') safe = false;
                        }
                        if (i + 1 < 5 && j - 1 >= 0 && room[i + 1][j - 1] == 'P') {
                            if (room[i + 1][j] != 'X' || room[i][j - 1] != 'X') safe = false;
                        }
                    }
                }
            }

            answer[k] = safe ? 1 : 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
    }
}
