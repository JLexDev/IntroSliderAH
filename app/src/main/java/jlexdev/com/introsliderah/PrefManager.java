package jlexdev.com.introsliderah;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by JLex on 18/11/16.
 *
 * Utilizo SharedPreferences para almacenar un valor booleano que indica el primer inicio.
 */

public class PrefManager {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context context;

    // Shared Pref Mode
    int PRIVATE_MODE = 0;

    // Shared Preferences File Name
    private static final String PREF_NAME = "jlexdev-welcome";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    /** Constructor ¿?¿?
    public PrefManager(SharedPreferences preferences, SharedPreferences.Editor editor, Context context, int PRIVATE_MODE) {
        this.preferences = preferences;
        this.editor = editor;
        this.context = context;
        this.PRIVATE_MODE = PRIVATE_MODE;
    }
    */


    public PrefManager(Context context){
        this.context = context;
        preferences = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = preferences.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime){
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLauch(){
        return preferences.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

}
