package week24;

import java.util.Arrays;

public class SortFileName {
    public static String[] solution(String[] files) {
        Arrays.sort(
                files, (a, b) ->{
                    String[] aFile = splitFiles(a);
                    String[] bFile = splitFiles(b);
                    int headCmp = aFile[0].toLowerCase().compareTo(bFile[0].toLowerCase());
                    if(headCmp != 0) {
                        return headCmp;
                    }
                    int aFileNum = Integer.parseInt(aFile[1]);
                    int bFileNum = Integer.parseInt(bFile[1]);
                    return  aFileNum - bFileNum;
                }
        );

        return files;
    }

    public static String[] splitFiles(String file){
        int start = -1;
        int end = file.length();
        for(int i = 0; i < file.length(); i++){
            if(Character.isDigit(file.charAt(i))){
                if(start == -1){
                    start = i;
                }
            }else{
                if(start != -1){
                    end = i;
                    break;
                }
            }
        }
        String head = file.substring(0, start);
        String number = file.substring(start, end);
        String tail = file.substring(end);
        return new String[]{head, number, tail};
    }

    public static void main(String[] args) {
        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        System.out.println(Arrays.toString(solution(files)));
    }
}
