package com.designPattern.bridge;

import java.io.IOException;
import java.util.logging.*;

public class Client {
    public static void main(String[] args) {
        //System.out.println("Hello");
        message();
        /*try {
            HD();
        }catch (IOException e){

        }*/


    }
    public static void HD()throws IOException, SecurityException{
        LogRecord lr = new LogRecord(Level.INFO,"this text is log");
        Formatter f1 = new SimpleFormatter();
        Formatter f2 = new XMLFormatter();//记录的消息是xml形式
        Handler h = new FileHandler("cwb_log2");
        Handler h1 = new FileHandler("cwb_log");
        Handler h2 = new MemoryHandler(h,1000,Level.INFO);
        h1.setFormatter(f1);
        h1.publish(lr);
        h1.setFormatter(f2);
        h1.publish(lr);
        h2.setFormatter(f2);
        h2.publish(lr);

    }
    public static void message(){
        MessageMethod impl = new SMS();
        MessageMethod impl2 = new Email();
        MessageMethod impl3 = new MobileMessage();
        AbstractMessage m = new CommonMessage(impl);
        AbstractMessage m2 = new UrgentMessage(impl2);
        AbstractMessage m3 = new SpecialMessage(impl3);
        m.sendMessage("Heat Water","Li");
        m2.sendMessage("Submit Form","Wang");
        m3.sendMessage("Take a meet","Zhang");
    }

}
