package homelab.controller;


@org.springframework.stereotype.Service
public class Service {




    public void test(){
    try {
        Process p = new ProcessBuilder("ls").redirectErrorStream(true).start();
        System.out.println(new String(p.getInputStream().readAllBytes()));
        p.waitFor();
    }catch (Exception e){

    }
    }


}
