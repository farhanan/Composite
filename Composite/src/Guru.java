/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**In this class,there are many methods which are not applicable to developer because
 * it is a leaf node.
 * @author Opangs
 */ 
public class Guru implements Pegawai{
    private String name;
  private double salary;

  public Guru(String name,double salary){
    this.name = name;
    this.salary = salary;
  }
  public void add(Pegawai pegawai) {
    //this is leaf node so this method is not applicable to this class.
  }

  public Pegawai getChild(int i) {
    //this is leaf node so this method is not applicable to this class.
    return null;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public void print() {
    System.out.println("-------------");
    System.out.println("Nama ="+getName());
    System.out.println("Gaji ="+getSalary());
    System.out.println("-------------");
  }

  public void remove(Pegawai pegawai) {
    //this is leaf node so this method is not applicable to this class.
  }
    
}
