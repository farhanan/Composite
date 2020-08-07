/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Opangs
 */
public interface Pegawai {
   public void add(Pegawai pegawai);
   public void remove(Pegawai pegawai);
   public Pegawai getChild(int i);
   public String getName();
   public double getSalary();
   public void print();
}
