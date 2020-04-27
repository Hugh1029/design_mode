package cn.answering.design.mode.num2.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangjp
 * @date 2020-04-27 23:02
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 公司类，由多个部门组成
 */
public class Company {

    private String companyName;
    private String address;
    private String telephone;
    private String taxNo;
    private List<Dept> deptList = new ArrayList<>();

    public Company() {}

    public Company(String companyName, String address, String telephone, String taxNo) {
        this.companyName = companyName;
        this.address = address;
        this.telephone = telephone;
        this.taxNo = taxNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public void addDept(Dept d) {
        this.deptList.add(d);
    }

    public void deleteDept(Dept d) {
        this.deptList.remove(d);
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", taxNo='" + taxNo + '\'' +
                ", deptList=" + deptList +
                '}';
    }
}
