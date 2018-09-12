package simulacion.zamudio.tiroparabolico;

public class Calcular {

    private double vi,d,r,teta,t;

    public void calcular(){
        double vx,vy;
        vx = getVi()*Math.cos(Math.toRadians(teta));
        vy = getVi()*Math.sin(Math.toRadians(teta));
        t = vy/9.8;
        d = (vy*t) + (0.5*(-9.8)*Math.pow(t,2));
        r = vx*(2*t);
    }
/*----------------------------------*/
    public void setVi(double vi) {
        this.vi = vi;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setTeta(double teta) {
        this.teta = teta;
    }
    /*----------------------------------*/

    public double getVi() {
        return vi;
    }

    public double getD() {
        return d;
    }

    public double getR() {
        return r;
    }

    public double getTeta() {
        return teta;
    }

    public double getT() {
        return t*2;
    }
}
