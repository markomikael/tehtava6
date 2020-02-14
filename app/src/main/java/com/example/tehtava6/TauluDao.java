package com.example.tehtava6;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Dao;

import java.util.List;

@Dao

public interface TauluDao {

    @Query("SELECT * FROM myentity ORDER BY id desc")
    List<MyEntity> getAllInDescendingOrder();

    @Insert
    void InsertMyEntity(MyEntity myEntity);

    @Delete
    void DeleteMyEntity(MyEntity myentity);
}








