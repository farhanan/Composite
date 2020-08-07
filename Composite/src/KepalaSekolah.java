/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Opangs
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class KepalaSekolah implements Pegawai{
     private String name;
 private double salary;

 public KepalaSekolah(String name,double salary){
  this.name = name;
  this.salary = salary;
 }

 List<Pegawai> employees = new ArrayList<Pegawai>();
 public void add(Pegawai pegawai) {
    employees.add(pegawai);
 }

 public Pegawai getChild(int i) {
  return employees.get(i);
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

  Iterator<Pegawai> pegawaiIterator = employees.iterator();
    while(pegawaiIterator.hasNext()){
     Pegawai pegawai = pegawaiIterator.next();
     pegawai.print();
    }
 }

 public void remove(Pegawai pegawai) {
  employees.remove(pegawai);
 }
}
