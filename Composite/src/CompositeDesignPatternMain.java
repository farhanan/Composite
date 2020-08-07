/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Opangs
 */
public class CompositeDesignPatternMain {
    public static void main(String[] args) {
  Pegawai emp1=new Guru("Ari", 1000000);
  Pegawai emp2=new Guru("Daviid", 1500000);
  Pegawai manager1=new KepalaSekolah("Ferry",2500000);
  manager1.add(emp1);
  manager1.add(emp2);
  Pegawai emp3=new Guru("Supriadi", 2000000);
  KepalaSekolah kepalaSekolah=new KepalaSekolah("Mandra", 5000000);
  kepalaSekolah.add(emp3);
  kepalaSekolah.add(manager1);
  kepalaSekolah.print();
 }
}
