package com.company;

import java.util.Comparator;

public class DearDiary implements Comparator<DearDiary> {
    int tahun, hari;
    String isiCatatan, waktu;
    Integer bulan;

    public DearDiary(int hari, int bulan, int tahun, String waktu, String isiCatatan) {
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
        this.waktu = waktu;
        this.isiCatatan = isiCatatan;
    }

    public Integer getBulan() {
        return bulan;
    }

    @Override
    public String toString() {
        return "DearDiary " +
                " Hari : " + hari +
                ", Bulan : " + bulan +
                ", Tahun : " + tahun +
                ", Waktu : " + waktu +
                ", Isi Catatan : " + isiCatatan +
                ' ';
    }
    @Override
    public int compare(DearDiary o1, DearDiary o2){
        return 0;
    }

    static class SortByName implements Comparator<DearDiary> {
        @Override
        public int compare(DearDiary o1, DearDiary o2) {
            return o1.getBulan().compareTo(o2.getBulan());
        }
    }
}