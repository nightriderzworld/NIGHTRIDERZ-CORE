package com.soapboxrace.core.bo;

import javax.ejb.Stateless;
import java.util.HashMap;
import java.util.Map;

@Stateless
public class CarBO
{
    private final Map<String, String> carBrandMap = new HashMap<>();

    {
        carBrandMap.put("135I", "BMW");
        carBrandMap.put("1MSERIES", "BMW");
        carBrandMap.put("1SERIES", "BMW");
        carBrandMap.put("2000GTR", "NISSAN");
        carBrandMap.put("200SX", "NISSAN");
        carBrandMap.put("240SX", "NISSAN");
        carBrandMap.put("240ZG", "NISSAN");
        carBrandMap.put("300C", "CHRYSLER");
        carBrandMap.put("30CSL", "BMW");
        carBrandMap.put("350Z", "NISSAN");
        carBrandMap.put("370Z", "NISSAN");
        carBrandMap.put("8C", "ALFAROMEO");
        carBrandMap.put("911", "PORSCHE");
        carBrandMap.put("911RSR30", "PORSCHE");
        carBrandMap.put("911TURBO", "PORSCHE");
        carBrandMap.put("9146", "PORSCHE");
        carBrandMap.put("9146GT", "PORSCHE");
        carBrandMap.put("959", "PORSCHE");
        carBrandMap.put("A1", "AUDI");
        carBrandMap.put("A3", "AUDI");
        carBrandMap.put("AGERA", "KOENIGSEGG");
        carBrandMap.put("AVENTADOR", "LAMBORGHINI");
        carBrandMap.put("BFH", "NEED FOR SPEED SUV");
        carBrandMap.put("BOSS302", "FORD");
        carBrandMap.put("BOXSTER", "PORSCHE");
        carBrandMap.put("CAMARO", "CHEVROLET");
        carBrandMap.put("CAMAROSS", "CHEVROLET");
        carBrandMap.put("CAMPER", "UNLOCALIZED_STRING");
        carBrandMap.put("CAPRI", "FORD");
        carBrandMap.put("CARRERA", "PORSCHE");
        carBrandMap.put("CATERHAM", "CATERHAM");
        carBrandMap.put("CAYMAN", "PROSCHE");
        carBrandMap.put("CCX", "KOENIGSEGG");
        carBrandMap.put("CCXR", "KOENIGSEGG");
        carBrandMap.put("CHALLENGER", "DODGE");
        carBrandMap.put("CHARGER", "DODGE");
        carBrandMap.put("CHEVELLE", "CHEVROLET");
        carBrandMap.put("CLIO", "RENAULTSPORT");
        carBrandMap.put("COBALT", "CHEVROLET");
        carBrandMap.put("COBRA", "CHEVROLET");
        carBrandMap.put("COBRADAYTONA", "CHEVROLET");
        carBrandMap.put("CONTINENTAL", "BENTLEY");
        carBrandMap.put("COROLLA", "TOYOTA");
        carBrandMap.put("CORVETTE", "CHEVROLET");
        carBrandMap.put("COUNTACH", "LAMBORGHINI");
        carBrandMap.put("CROWNVICTORIA", "FORD");
        carBrandMap.put("CTSV", "CADILLAC");
        carBrandMap.put("DBS", "ASTONMARTIN");
        carBrandMap.put("DELTAHF", "LANCIA");
        carBrandMap.put("DIABLOSV", "LAMBORGHINI");
        carBrandMap.put("DUMP", "UNLOCALIZED_STRING");
        carBrandMap.put("E92", "BMW");
        carBrandMap.put("ECLIPSE", "MITSUBISHI");
        carBrandMap.put("ELCAMINO", "CHEVROLET");
        carBrandMap.put("ELISE", "LOTUS");
        carBrandMap.put("ESCORT", "FORD");
        carBrandMap.put("ESCORTRSCOS", "FORD");
        carBrandMap.put("ESTOQUE", "LAMBORGHINI");
        carBrandMap.put("ETYPE", "JAGUAR");
        carBrandMap.put("EUROPA", "LOTUS");
        carBrandMap.put("EVORA", "LOTUS");
        carBrandMap.put("EXIGE", "LOTUS");
        carBrandMap.put("EXIGECUP260", "LOTUS");
        carBrandMap.put("F150", "FORD");
        carBrandMap.put("FC3S", "MAZDA");
        carBrandMap.put("FIRE", "UNLOCALIZED_STRING");
        carBrandMap.put("FIREBIRDFORMULA", "PONTIAC");
        carBrandMap.put("FOCUS", "FORD");
        carBrandMap.put("FORDGT", "FORD");
        carBrandMap.put("G35", "INFINITI");
        carBrandMap.put("GALLARDO", "LAMBORGHINI");
        carBrandMap.put("GOLF", "VOLKSWAGEN");
        carBrandMap.put("GOLFMK1", "VOLKSWAGEN");
        carBrandMap.put("GRANDCHEROKEE", "JEEP");
        carBrandMap.put("GT40", "FORD");
        carBrandMap.put("GT500", "FORDSHELBY");
        carBrandMap.put("GTI", "VOLKSWAGEN");
        carBrandMap.put("GTO", "PONTIAC");
        carBrandMap.put("GTR", "NISSAN");
        carBrandMap.put("H1", "HUMMER");
        carBrandMap.put("H1ALPHA", "HUMMER");
        carBrandMap.put("HELI", "BUGATTI");
        carBrandMap.put("HEMICUDA", "PLYMOUTH");
        carBrandMap.put("IMPREZA", "SUBARU");
        carBrandMap.put("IS300", "LEXUS");
        carBrandMap.put("IS350", "LEXUS");
        carBrandMap.put("ISF", "LEXUS");
        carBrandMap.put("LANCEREVO", "MITSUBISHI");
        carBrandMap.put("LANCEREVO8", "MITSUBISHI");
        carBrandMap.put("LANCEREVO9", "MITSUBISHI");
        carBrandMap.put("LANCIADELTAHF", "LANCIA");
        carBrandMap.put("LFA", "LEXUS");
        carBrandMap.put("LOTUSCORTINA", "FORD");
        carBrandMap.put("M1", "BMW");
        carBrandMap.put("M3", "BMW");
        carBrandMap.put("M3E30", "BMW");
        carBrandMap.put("M3GTRE46", "BMW");
        carBrandMap.put("M6", "BMW");
        carBrandMap.put("M6CONV", "BMW");
        carBrandMap.put("MARUSSIA", "MARUSSIA");
        carBrandMap.put("MAZDA3", "MAZDA");
        carBrandMap.put("MCLAREN", "MCLAREN");
        carBrandMap.put("MEGANE", "RENAULTSPORT");
        carBrandMap.put("MEGANERS", "RENAULTSPORT");
        carBrandMap.put("MINIVAN", "UNLOCALIZED_STRING");
        carBrandMap.put("MIURA", "LAMBORGHINI");
        carBrandMap.put("MIURASV", "LAMBORGHINI");
        carBrandMap.put("MONARO", "VAUXHALL");
        carBrandMap.put("MP412C", "MCLAREN");
        carBrandMap.put("MR2", "TOYOTA");
        carBrandMap.put("MURCIELAGO", "LAMBORGHINI");
        carBrandMap.put("MW05", "UNLOCALIZED_STRING");
        carBrandMap.put("MX5", "MAZDA");
        carBrandMap.put("PANAMERA", "PORSCHE");
        carBrandMap.put("PICKUP", "UNLOCALIZED_STRING");
        carBrandMap.put("POLICEINTERCEPTOR", "FORD");
        carBrandMap.put("QUATTRO20V", "AUDI");
        carBrandMap.put("R32", "VOLKSWAGEN");
        carBrandMap.put("R34GTR", "NISSAN");
        carBrandMap.put("R8", "AUDI");
        carBrandMap.put("REVENTON", "LAMBORGHINI");
        carBrandMap.put("RHINO", "JEEP");
        carBrandMap.put("ROADRUNNER", "PLYMOUTH");
        carBrandMap.put("RS4", "AUDI");
        carBrandMap.put("RTRX", "FORD");
        carBrandMap.put("RX7", "MAZDA");
        carBrandMap.put("RX7RZ", "MAZDA");
        carBrandMap.put("RX8", "MAZDA");
        carBrandMap.put("S5", "AUDI");
        carBrandMap.put("SCIONTC", "SCION");
        carBrandMap.put("SCIROCCO", "VOLKSWAGEN");
        carBrandMap.put("SESTOELEMENTO", "LAMBORGHINI");
        carBrandMap.put("SHELBY", "FORDSHELBY");
        carBrandMap.put("SHELBYTERLINGUA", "FORDSHELBY");
        carBrandMap.put("SILVIA", "NISSAN");
        carBrandMap.put("SKYLINE", "NISSAN");
        carBrandMap.put("SKYLINER32", "NISSAN");
        carBrandMap.put("SKYLINER34", "NISSAN");
        carBrandMap.put("SLR", "MERCEDES-BENZ");
        carBrandMap.put("SOLSTICE", "PONTIAC");
        carBrandMap.put("STINGRAY", "CHEVROLET");
        carBrandMap.put("SUPRA", "TOYOTA");
        carBrandMap.put("TAXI", "UNLOCALIZED_STRING");
        carBrandMap.put("TTRS", "AUDI");
        carBrandMap.put("UCMUS", "UNLOCALIZED_STRING");
        carBrandMap.put("COPSPORTGHOST", "LAMBORGHINI");
        carBrandMap.put("V12", "ASTONMARTIN");
        carBrandMap.put("VEYRON", "BUGATTI");
        carBrandMap.put("COPHELI", "BUGATTI");
        carBrandMap.put("VIPER", "DODGE");
        carBrandMap.put("XKR", "JAGUAR");
        carBrandMap.put("Z4", "BMW");
        carBrandMap.put("ZONDA", "PAGANI");
    }

    public String getBrand(String carId)
    {
        return carBrandMap.getOrDefault(carId, "UNLOCALIZED_STRING");
    }
}
