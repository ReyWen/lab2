package com.ua.lviv.iot.manager;

import com.ua.lviv.iot.hierarchy.Machine;
import com.ua.lviv.iot.hierarchy.SkippingRope;
import com.ua.lviv.iot.hierarchy.StationaryBike;
import com.ua.lviv.iot.hierarchy.Treadmill;

public class Gym {
    Treadmill treadmill1=new Treadmill(10, 5, 5, 10,"treadmill");
    StationaryBike stationaryBike1=new StationaryBike(20, 10, 10, 1000, "starionarybike");
    SkippingRope skippingRope1=new SkippingRope(0,10, 15, "skakalka", 120);
    Machine[] arrOfMachines={treadmill1, stationaryBike1, skippingRope1};
    Manager manager=new Manager(arrOfMachines);

}
