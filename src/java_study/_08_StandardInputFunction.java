package java_study;
// readLine은 입력장치(키보드)로부터 라인 전체를 읽는 표준 입력 함수
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class _08_StandardInputFunction {
    public static void main(String[] args) throws IOException {
         String a = null;
         BufferedReader r =
                 new BufferedReader(new InputStreamReader(System.in));
         a = r.readLine();

         System.out.println(a);
    }
}
