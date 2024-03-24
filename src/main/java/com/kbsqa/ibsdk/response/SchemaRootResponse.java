
package com.kbsqa.ibsdk.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SchemaRootResponse {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("schema")
    @Expose
    private List<Schema> schema;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Schema> getSchema() {
        return schema;
    }

    public void setSchema(List<Schema> schema) {
        this.schema = schema;
    }

}
