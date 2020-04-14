import javafx.scene.control.TextField;
import org.ejml.equation.Equation;



public class Formula {

    private double Pzu = 0.0F;
    private double U = 0.0F;
    private double I = 0.0F;
    private double R = 0.0F;
    private double EtaM = 0.0F;
    private double PvelM = 0.0F;
    private double Pvmech = 0.0F;
    private double Pv = 0.0F;
    private double PM = 0.0F;
    private double MM = 0.0F;
    private double nM = 0.0F;
    private double EtaG = 0.0F;
    private double i = 0.0F;
    private double PvG = 0.0F;
    private double PG = 0.0F;
    private double MG = 0.0F;
    private double nG = 0.0F;

    public Formula(){

    }

    public void set(TextField tF) {
        double a = Double.parseDouble(tF.getText());

    }
    public void setnM(TextField tF) {

    }
    public void setMM(TextField tF) {

    }
    public void setPab(TextField tF) {

    }
    public void setPvmech(TextField tF) {

    }
    public void setPvel(TextField tF) {

    }
    public void seti(TextField tF) {

    }
    public void setEtaG(TextField tF) {

    }
    public void setnG(TextField tF) {

    }
    public void setMG(TextField tF) {

    }
    public void setPG(TextField tF) {

    }
    public void setEtaM(TextField tF) {

    }
    public void setR(TextField tF) {

    }
    public void setU(TextField tF) {

    }
    public void setPzu(TextField tF) {

    }
    public void setI(TextField tF) {

    }
    public void setPvG(TextField tF) {

    }
    public void setPvM(TextField tF) {

    }

    public void URI(){
        Equation eq = new Equation();
        eq.alias(U,"U",R,"R",I,"I");
        eq.process("U / I = R");
    }
    public void PowerMotor(){
        Equation eq = new Equation();
    }
    public void ElePowerLoss(){
        Equation eq = new Equation();
    }
    public void MechPowerLoss(){
        Equation eq = new Equation();
    }
    public void PowerLossMotor(){
        Equation eq = new Equation();
    }
    public void TorqueMotor(){
        Equation eq = new Equation();
    }
    public void ETAMotor(){
        Equation eq = new Equation();
    }
    public void GearPower(){
        Equation eq = new Equation();
    }
    public void Gear(){
        Equation eq = new Equation();
    }
    public void GearPowerLoss(){
        Equation eq = new Equation();
    }
}
