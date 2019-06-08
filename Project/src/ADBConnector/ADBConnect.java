package ADBConnector;

import java.io.*;

public class ADBConnect {

    public static void main(String[] args) throws Exception {
                String[] commands = {"cmd.exe", "/c","adb devices && adb tcpip 5555 && adb connect 192.168.178.122 && adb devices"};
               ProcessBuilder p = new ProcessBuilder();
                p.command(commands);

                p.redirectErrorStream(true);
                Process proc  = p.start();
                   // ,"adb tcpip 5555","adb connect 192.168.178.122"
                new Thread(()->{
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                        String line;
                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }).start();
                proc.waitFor();
                System.out.println("remove USB");
            }

   /* public static void pull(String androidPath){
        String[] commands = {"cmd.exe", "/c","adb pull"+androidPath};
        ProcessBuilder processBuilder = new ProcessBuilder(commands);
        processBuilder.redirectErrorStream(true);
        try {
            Process proc = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Thread(()->{
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }).start();

    }*/
}
