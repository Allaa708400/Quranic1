package com.example.quranic.data.pojo.prayermethods;
public class MWL implements IToMethod{
    public int id;
    public String name;
    public Params params;
    public Location location;

    @Override
    public PrayerTimingMethod toMethod() {
        return new PrayerTimingMethod(id,name,params,location);
    }
}
