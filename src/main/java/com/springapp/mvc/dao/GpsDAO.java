package com.springapp.mvc.dao;

import com.springapp.mvc.model.Gps;

import java.util.List;

/**
 * Created by loki on 3/31/15.
 */
public interface GpsDAO {
    public void addGps(Gps g);
    public void updateGps(Gps g);
    public List<Gps> listGpss();
    public Gps getGpsById(int id);
    public void removeGps(int id);
}
