package co.edu.uniquindio.HotelRemansoDePaz.factory;

import co.edu.uniquindio.HotelRemansoDePaz.service.ISalonEvento;

public class ModelFactory implements ISalonEvento {

    private static ModelFactory modelFactory;

    public static ModelFactory getInstance(){
        if(modelFactory == null){
            modelFactory = new ModelFactory();
        }

        return modelFactory;
    }

    @Override
    public String reservar() {
        return "";
    }
}