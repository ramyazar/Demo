package com.example.euriskoapp.AsyncTasks;

import org.json.JSONArray;
import org.json.JSONObject;

public interface DownloadJSONCallback {
    void jsonDownloaded(JSONArray jsonObject);
}
