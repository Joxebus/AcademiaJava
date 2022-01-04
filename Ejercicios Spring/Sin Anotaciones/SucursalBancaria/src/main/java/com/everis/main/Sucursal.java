package com.everis.main;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.context.ApplicationContext;

import com.everis.beans.EjecutivoCuenta;
import com.everis.beans.Supervisor;
import com.everis.util.SpringUtil;

public class Sucursal {

    public static void main(String[] args) {
        ApplicationContext context = SpringUtil.getContext();
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

        ses.scheduleAtFixedRate(context.getBean("ejecutivo", EjecutivoCuenta.class), 5, 10, TimeUnit.SECONDS);
        ses.scheduleAtFixedRate(context.getBean("supervisor", Supervisor.class), 15, 15, TimeUnit.SECONDS);


    }

}
