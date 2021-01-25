/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.argyaaf.latihanmvcjdbc.event;

import edu.argyaaf.latihanmvcjdbc.entity.Pelanggan;
import edu.argyaaf.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author
 * NIM : 10119035
 * NAMA : AARGYA AULIA FAUZANDIKA
 * KELAS : IF1
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);
    
}
