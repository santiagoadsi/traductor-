/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;

import Modelo.Palabras;
import java.util.HashMap;

/**
 *
 * @author WIN8
 */
public class servicios  extends Palabras {

      HashMap <Integer , String> Traductor = new HashMap <Integer , String> ();
      public servicios (){
        Traductor.put(1,"Arroz");
        Traductor.put(2,"Niño");
        Traductor.put(3,"Venir");
        Traductor.put(4,"Dado");
        Traductor.put(5,"Elefante");
        Traductor.put(6,"Fresa");
        Traductor.put(7,"Verde");
        Traductor.put(8,"Hola");
        Traductor.put(9,"Juguete");
        
      }
  
      public String busca (int inte){
      return Traductor.get(inte);
      }
      }

