package com.qualcomm.ftcrobotcontroller.opmodes;

import com.jacobamason.FTCRC_Extensions.Twitter4jWrapper;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jacob on 8/15/2015.
 */
public class TwitterOp extends OpMode
{
    Twitter4jWrapper twitter;
    @Override
    public void init()
    {
        twitter = new Twitter4jWrapper();
    }

    @Override
    public void start()
    {
        String startDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
                .format(new Date());
        twitter.updateStatus("Hello World! " + startDate);
    }

    @Override
    public void loop()
    {

    }
}
