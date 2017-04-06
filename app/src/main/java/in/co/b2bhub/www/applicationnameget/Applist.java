package in.co.b2bhub.www.applicationnameget;

import android.graphics.drawable.Drawable;

/**
 * Created by B2B Android on 3/24/2017.
 */

public class Applist {
    private String name;
    private String pname;
    Drawable icon;

    public String getDate() {
        return date;
    }

    private String date;

    public Applist(String name, Drawable icon, String pkg, String date) {
        this.name = name;
        this.icon = icon;
        this.pname=pkg;
        this.date=date;
    }

    public String getName() {
        return name;
    }

    public Drawable getIcon() {
        return icon;
    }

    public String getPname() {
        return pname;
    }
}
