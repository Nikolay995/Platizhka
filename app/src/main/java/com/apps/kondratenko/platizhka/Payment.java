package com.apps.kondratenko.platizhka;

/**
 * Created by strik on 18.12.2017.
 */

public class Payment {

    // Змінна,що міститиме в собі ім'я таблиці
    public static final String TABLE = "Student";

    // Імена стовпців
    public static final String KEY_ID = "id";
    public static final String KEY_name = "name";
    public static final String KEY_groupId = "groupId";
    public static final String KEY_stdId = "stdId";

    // типи даних полів
    public int payment_ID;
    public String name;
    public String groupId;
    public int stdId;
}