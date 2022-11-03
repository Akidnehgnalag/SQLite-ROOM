package com.example.sqliteroom.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DAONote {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(oten note);
    @Update()
    void update(note note);
    @Delete()
    void delete(note note);
    @Query("SELECT * from note ORDER BY id ASC")
    LiveData<List<note>> getAllNotes();
}
