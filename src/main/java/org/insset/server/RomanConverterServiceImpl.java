/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.insset.client.service.RomanConverterService;

/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class RomanConverterServiceImpl extends RemoteServiceServlet implements
        RomanConverterService {

    @Override
    public String convertDateYears(String nbr) {
        int day = 0;
        int month = 0;
        int year = 0;
        
      
        String[] components = nbr.split("/");
        day = Integer.parseInt(components[0]);
        month = Integer.parseInt(components[1]);
        year = Integer.parseInt(components[2]);
        
        
        //Implement your code
        return convertArabeToRoman(day)+"/"+convertArabeToRoman(month)+"/"+convertArabeToRoman(year);
    }

    @Override
    public Integer convertRomanToArabe(String nbr) {
        char[] charArray = nbr.toCharArray();
        int result = 0;
        int valueIntofCharPrev = 0;
        for (int i = (charArray.length)-1; i>=0; i--){
            char valueActual = charArray[i];
            int valueIntofChar = 0;
            if(valueActual == "I".charAt(0)){
                valueIntofChar = 1;
            } else if(valueActual == "V".charAt(0)){
                valueIntofChar = 5;
            } else if(valueActual == "X".charAt(0)){
                valueIntofChar = 10;
            } else if(valueActual == "L".charAt(0)){
                valueIntofChar = 50;
            } else if(valueActual == "C".charAt(0)){
                valueIntofChar = 100;
            } else if(valueActual == "D".charAt(0)){
                valueIntofChar = 500;
            } else if(valueActual == "M".charAt(0)){
                valueIntofChar = 1000;
            } else {
                return 0;
            }
            if(valueIntofChar < valueIntofCharPrev){
                result -= valueIntofChar;
            } else {
                result += valueIntofChar;
            }
            valueIntofCharPrev = valueIntofChar;
        }
        
        return result;
    }

    @Override
    public String convertArabeToRoman(Integer nbr) {
        String[] unite = {"", "I", "II","III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] dizaine = {"", "X", "XX","XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] centaine = {"", "C", "CC","CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] mille = {"", "M", "MM", "MMM"};

        return mille[nbr/1000]+centaine[(nbr%1000)/100]+dizaine[(nbr%100)/10]+unite[(nbr%10)/1];
    }

}
