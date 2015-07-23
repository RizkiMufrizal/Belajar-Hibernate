package com.rizki.mufrizal.belajarHibernate.repository;

import com.rizki.mufrizal.belajarHibernate.domain.Mahasiswa;

import java.util.List;

/**
 * Created by rizki on 23/07/15.
 */
public interface MahasiswaRepository {
    void save(Mahasiswa mahasiswa);
    void update(Mahasiswa mahasiswa);
    void delete(Mahasiswa mahasiswa);
    Mahasiswa getMahasiswa(String npm);
    List<Mahasiswa> getMahasiswas();
}
