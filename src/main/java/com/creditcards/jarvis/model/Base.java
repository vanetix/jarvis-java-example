package com.creditcards.jarvis.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@MappedSuperclass
public class Base {
    @Column(name = "inserted_at")
    private Timestamp insertedAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    public Timestamp getInsertedAt() {
        return insertedAt;
    }

    public void setInsertedAt(Timestamp insertedAt) {
        this.insertedAt = insertedAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
