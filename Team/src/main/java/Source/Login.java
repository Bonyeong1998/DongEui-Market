/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

/**
 *
 * @author CHANG
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Login {
    
    public String login(String id, String pw) {
        int pass = 0;
        File file = new File("..\\MemberDB.txt");
        try {
            FileReader filereader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";
            try {
                while ((line = bufReader.readLine()) != null) {
                    System.out.println(line.indexOf(id) + "\t" + line.indexOf(pw));
                    int passId = line.indexOf(id);
                    int passPw = line.indexOf(pw);
                    if (passId != -1 && passPw != -1) {
                        pass = -1;
                        return "로그인 성공";
                    }    
                }
                if (pass == 0) {
                        return "로그인 실패";
                    }
                bufReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }
}
