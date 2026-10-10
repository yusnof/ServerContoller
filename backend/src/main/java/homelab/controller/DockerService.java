package homelab.controller;
import org.springframework.stereotype.Service;


@Service
public class DockerService {


    public String  test(){
        try {
            Process p = new ProcessBuilder("ls").redirectErrorStream(true).start();
            System.out.println(new String(p.getInputStream().readAllBytes()));
            p.waitFor();

            return p.getOutputStream().toString();
        }catch (Exception e){

            return e.getMessage();

        }
    }

}
