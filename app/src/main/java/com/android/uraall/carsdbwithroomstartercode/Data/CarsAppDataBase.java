package com.android.uraall.carsdbwithroomstartercode.Data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.android.uraall.carsdbwithroomstartercode.Model.Car;

@Database(entities = {Car.class}, version = 1)
public abstract class CarsAppDataBase extends RoomDatabase {

    public abstract CarDAO getCarDAO();
}
