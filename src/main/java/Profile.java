import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.HashMap;

public class Profile {


    private String name = null;
    private double vdc = 0D;
    private double crs = 0;
    private double crt = 0D;
    private double cc = 0D;
    private double st = 0D;
    private double sc = 0D;
    private double nls = 0;
    private double nlc = 0D;
    private double ri = 0D;
    private double woe = 0D;


    public Profile(String name, double vdc, double crs, double crt, double cc, double st, double sc, double nls, double nlc, double ri, double woe){
        this.name = name;
        this.vdc = vdc;
        this.crs = crs;
        this.crt = crt;
        this.cc = cc;
        this.st = st;
        this.sc = sc;
        this.nls = nls;
        this.nlc = nlc;
        this.ri = ri;
        this.woe = woe;
    }
    public Profile(){

    }



    public void setName(String name) {
        this.name = name;
    }

    public void setVdc(double vdc) {
        this.vdc = vdc;
    }

    public void setCrs(double crs) {
        this.crs = crs;
    }

    public void setCrt(double crt) {
        this.crt = crt;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public void setSt(double st) {
        this.st = st;
    }

    public void setSc(double sc) {
        this.sc = sc;
    }

    public void setNls(double nls) {
        this.nls = nls;
    }

    public void setNlc(double nlc) {
        this.nlc = nlc;
    }

    public void setRi(double ri) {
        this.ri = ri;
    }

    public void setWoe(double woe) {
        this.woe = woe;
    }

    public double getCc() {
        return cc;
    }

    public double getCrs() {
        return crs;
    }

    public double getCrt() {
        return crt;
    }

    public double getNlc() {
        return nlc;
    }

    public double getNls() {
        return nls;
    }

    public double getRi() {
        return ri;
    }

    public double getSc() {
        return sc;
    }

    public double getSt() {
        return st;
    }

    public double getVdc() {
        return vdc;
    }

    public double getWoe() {
        return woe;
    }

    public String getName() {
        return name;
    }

    public Profile getProfile(){
        return this;
    }
}
