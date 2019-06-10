package ADBConnector;

import java.io.*;
import java.util.Scanner;

public class ADBConnect {

    public static void main(String[] args) throws Exception {
        ADBConnect adb = new ADBConnect();
        adb.killServer();
        adb.connect(5555,"192.168.178.122");
        adb.push("C:/Users/Sefa/Desktop/test.docx","/sdcard/");
    }
    //port 5555 192.168.178.122
    private void connect(int port, String androidIP){
        try {
        String[] commands = {"cmd.exe", "/c","adb devices && adb tcpip "+port+" && adb connect "+androidIP+" && adb devices"};
        ProcessBuilder p = new ProcessBuilder();
        p.command(commands);

        p.redirectErrorStream(true);
        Process proc  = p.start();

        IOThreadHandler handler = new IOThreadHandler(proc.getInputStream());
        handler.start();
        proc.waitFor();

        System.out.println("CONNECTION DONE! ");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void pull(String src,String androidPath){
        try {
            String[] commands = {"cmd.exe", "/c","cd "+src+" && adb pull "+androidPath};
            ProcessBuilder processBuilder = new ProcessBuilder(commands);
            processBuilder.redirectErrorStream(true);

            Process proc = processBuilder.start();
            IOThreadHandler outputHandler = new IOThreadHandler(proc.getInputStream());
            outputHandler.start();
            proc.waitFor();
            System.out.println(outputHandler.getOutput());
            System.out.println("ADB PULL "+androidPath+" DONE!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void killServer(){
        try {
            String[] commands = {"cmd.exe", "/c","adb kill-server"};
            ProcessBuilder processBuilder = new ProcessBuilder(commands);
            processBuilder.redirectErrorStream(true);

            Process proc = processBuilder.start();
            IOThreadHandler outputHandler = new IOThreadHandler(proc.getInputStream());
            outputHandler.start();
            proc.waitFor();
            System.out.println(outputHandler.getOutput());
            System.out.println("SERVER KILLED!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void push(String src,String androidPath){
        try {
            String[] commands = {"cmd.exe", "/c","adb push "+src+" androidPath"};
            ProcessBuilder processBuilder = new ProcessBuilder(commands);
            processBuilder.redirectErrorStream(true);

            Process proc = processBuilder.start();
            IOThreadHandler outputHandler = new IOThreadHandler(proc.getInputStream());
            outputHandler.start();
            proc.waitFor();
            System.out.println(outputHandler.getOutput());
            System.out.println("ADB PUSH FROM "+src+" TO "+androidPath+" DONE!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class IOThreadHandler extends Thread {
    private InputStream inputStream;
    private StringBuilder output = new StringBuilder();

    IOThreadHandler(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public void run() {
        Scanner br = null;
        try {
            br = new Scanner(new InputStreamReader(inputStream));
            String line = null;
            while (br.hasNextLine()) {
                line = br.nextLine();
                output.append(line
                        + System.getProperty("line.separator"));
            }
        } finally {
            assert br != null;
            br.close();
        }
    }

    public StringBuilder getOutput() {
        return output;
    }
}
