/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava01.exercice_ferme.event;

import java.beans.EventHandler;
import javafx.event.Event;
import javafx.event.EventType;

/**
 *
 * @author Formation
 */
public class EventInscription extends Event{
    
    public EventInscription(EventType<? extends Event> eventType) {
        super(eventType);
    }
    
    
    
    
}
