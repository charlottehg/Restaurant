package minfil;

import javax.swing.*;
import java.util.Date;

public class Order {
    private int antPers;
    private Date tid;
    private int antMiddager;
    private String id;

    public Order() {
        this.antPers = antPers;
        this.tid = tid;
    }
    public int getAntPers() {
        return antPers;
    }
    public void setAntPers(int antPers) {
        this.antPers = antPers;
    }
    public Date getTid() {
        return tid;
    }
    public void setTid(Date tid) {
        this.tid = tid;
    }
    public int getAntMiddager(){
        return antMiddager;
    }
    public void setAntMiddager(int antMiddager){
        this.antMiddager=antMiddager;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public boolean sjekkOmString(){
        boolean valid = false;
        while (!valid) {
            try {
                if(antPers>=0)valid=true;
                if(antMiddager>=0)valid=true;
            } catch (NumberFormatException e) {
                //error
                JOptionPane.showConfirmDialog(null,"Error, not a number. Please try again.");
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Order{" +
                "antPers=" + antPers +
                ", tid=" + tid +
                ", antMiddager=" + antMiddager +
                ", id='" + id + '\'' +
                '}';
    }
}
