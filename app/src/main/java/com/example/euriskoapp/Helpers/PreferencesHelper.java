package com.example.euriskoapp.Helpers;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Ramy on 5/10/2019.
 */
public class PreferencesHelper {
    private static PreferencesHelper instance = null;
    private SharedPreferences preferences = null;

    public PreferencesHelper(SharedPreferences preferences) {
        this.preferences = preferences;
    }

    public static PreferencesHelper getInstance(Context ctx) {
        if (instance == null) {
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(ctx);
            instance = new PreferencesHelper(preferences);
        }

        return instance;
    }

    private void standardUserDefaultsSetString(String value, String key) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    private void standardUserDefaultsSetBoolean(boolean value, String key) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    private void standardUserDefaultsSetLong(long value, String key) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putLong(key, value);
        editor.apply();
    }

    public void clearSharedPreference() {
        preferences.edit().clear().apply();
    }

    public void setRememberMeValue(boolean isSaved) {
        standardUserDefaultsSetBoolean(isSaved, "isSaved");
    }

    public boolean getRememberMeValue() {
        return preferences.getBoolean("isSaved", false);
    }

    public void setTimerValue(long timerValue) {
        standardUserDefaultsSetLong(timerValue, "timeValue");
    }

    public long getTimerValue() {
        return preferences.getLong("timeValue", 0L);
    }

    public void setEndTimerValue(long endTime) {
        standardUserDefaultsSetLong(endTime, "endTime");
    }

    public long getEndTimerValue() {
        return preferences.getLong("endTime", 0L);
    }
    public void setIsTimerRunning(boolean isSaved) {
        standardUserDefaultsSetBoolean(isSaved, "isSaved");
    }

    public boolean isTimerRunning() {
        return preferences.getBoolean("isSaved", false);
    }

}
