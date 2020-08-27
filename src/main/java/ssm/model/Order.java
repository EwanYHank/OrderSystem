package ssm.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Order {
    private String bh;
    private String bhUser;
    private String spmc;
    private double je;
    private int sl;
    private Date cjsj;
    private Date xgsj;

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }

    public String getBhUser() {
        return bhUser;
    }

    public void setBhUser(String bhUser) {
        this.bhUser = bhUser;
    }

    public String getSpmc() {
        return spmc;
    }

    public void setSpmc(String spmc) {
        this.spmc = spmc;
    }

    public double getJe() {
        return je;
    }

    public void setJe(double je) {
        this.je = je;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public Date getXgsj() {
        return xgsj;
    }

    public void setXgsj(Date xgsj) {
        this.xgsj = xgsj;
    }
}
