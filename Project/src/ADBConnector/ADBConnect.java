package ADBConnector;

import java.io.*;

public class ADBConnect {
        private static Process proc;
        private static ProcessBuilder p;
    public static void main(String[] args) throws Exception {
                String[] commands = {"cmd.exe", "/c","adb devices"};
               p = new ProcessBuilder();
                p.command(commands);

                p.redirectErrorStream(true);
                proc = p.start();
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
               if(!proc.isAlive()) {
                   p.command("adb tcpip 5555");
                   p.start();

               }
            }


}
