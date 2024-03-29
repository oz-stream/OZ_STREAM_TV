package com.oz_stream.tv.data.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BandeAnonce implements Parcelable {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name = null;
    @SerializedName("link")
    @Expose
    private String link = null;
    @SerializedName("description")
    @Expose
    private String description = null;
    @SerializedName("created_at")
    @Expose
    private String created_at = null;;
    @SerializedName("updated_at")
    @Expose
    private String updated_at = null;
    @SerializedName("user_id")
    @Expose
    private String user_id = null;
    @SerializedName("created_by")
    @Expose
    private String created_by = null;
    @SerializedName("updated_by")
    @Expose
    private String updated_by = null;
    @SerializedName("serie_id")
    @Expose
    private String serie_id = null;


    protected BandeAnonce(Parcel in) {
        id = in.readInt();
        name = in.readString();
        link = in.readString();
        description = in.readString();
        created_at = in.readString();
        updated_at = in.readString();
        user_id = in.readString();
        created_by = in.readString();
        updated_by = in.readString();
        serie_id = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(link);
        dest.writeString(description);
        dest.writeString(created_at);
        dest.writeString(updated_at);
        dest.writeString(user_id);
        dest.writeString(created_by);
        dest.writeString(updated_by);
        dest.writeString(serie_id);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<BandeAnonce> CREATOR = new Creator<BandeAnonce>() {
        @Override
        public BandeAnonce createFromParcel(Parcel in) {
            return new BandeAnonce(in);
        }

        @Override
        public BandeAnonce[] newArray(int size) {
            return new BandeAnonce[size];
        }
    };


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }

    public String getSerie_id() {
        return serie_id;
    }

    public void setSerie_id(String serie_id) {
        this.serie_id = serie_id;
    }

    public static Creator<BandeAnonce> getCREATOR() {
        return CREATOR;
    }
}
