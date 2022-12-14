/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.UserAccount;
import View.AttractionView;
import View.NavigationView;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

/**
 * Controls the navigation, initiates controllers based on user actions.
 *
 * @author aic5588
 */
public class NavigationController {

    /**
     * This is the default constructor that initiates other controllers to open
     * user interfaces.
     */
    UserAccount activeUser;
    NavigationView navView;

    public NavigationController() {
        NavigationView navView = new NavigationView();
        navView.setVisible(true);
        addListeners(navView);

    }

    public NavigationController(UserAccount activeUser) {
        NavigationView navView = new NavigationView();
        navView.setVisible(true);

        this.activeUser = activeUser;
        addListeners(navView);

    }

    /**
     * Opens the UI for the user to purchase tickets.
     *
     * @param event will be pass as a parameter to initialize corresponding
     * controllers.
     */
    public void addListeners(NavigationView navView) {
        navView.getPurchaseButton().addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                    PurchaseTicketController purch = new PurchaseTicketController(activeUser);
                navView.setVisible(false);
                

            }
        });
        if (activeUser.isTicketHolder() == true) {
            navView.getSchAttBtn().setEnabled(true);
            navView.getViewProfileBtn().setEnabled(true);
            navView.getReserveBtn().setEnabled(true);
            navView.getSchAttBtn().addActionListener(                
                    new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    AttractionsController att = new AttractionsController(navView, activeUser);
                } catch (IOException ex) {
                    Logger.getLogger(NavigationController.class.getName()).log(Level.SEVERE, null, ex);
                }}});
            navView.getReserveBtn().addActionListener(                
                    new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ReservationController reserveController = new ReservationController(navView, activeUser);
                } catch (IOException ex) {
                    Logger.getLogger(NavigationController.class.getName()).log(Level.SEVERE, null, ex);
                }
     }
        });
            
             navView.getViewProfileBtn().addActionListener(                
                    new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UserActionController userActionController = new UserActionController(navView, activeUser);
                } catch (IOException ex) {
                    Logger.getLogger(NavigationController.class.getName()).log(Level.SEVERE, null, ex);
                }         

     }
        });
            //navView.getOrderBtn().addActionListener(this);
            // navView.getReserveBtn().addActionListener(this);
        }
     navView.getHomeBtn().addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             navView.setVisible(false);
                            JComponent comp = (JComponent) e.getSource();
                            Window win = SwingUtilities.getWindowAncestor(comp);
                            win.dispose();
         NavigationController nav = new NavigationController(activeUser);     
       
                

            }
        });
    }


    /**
     * Opens the UI for the user to view carry out order items.
     *
     * @param event will be passes as a parameter to initialized corresponding
     * controllers.
     */
    public void carryoutOrderButtonClicked(ActionEvent e) {
        CarryoutOrderController carryoutOrder = new CarryoutOrderController();
    }

    /**
     * Opens the UI for the user to view reservations at sit down restaurants
     *
     * @param event will be passes as a parameter to initialized corresponding
     * controllers.
     */

    public void reservationButtonClicked(ActionEvent e) {
        
    }

    /**
     * Opens the UI for the user to view their profile.
     *
     * @param event will be passes as a parameter to initialized corresponding
     * controllers.
     */
    public void profileButtonClicked() {
        UserActionController currentUser = new UserActionController();
        currentUser.addToScheduleClicked(4325345, "bobtest");
        currentUser.getScheduleButtonClicked();
    }

    public NavigationView getNavView() {
        return navView;
    }

    public void setNavView(NavigationView navView) {
        this.navView = navView;
    }

}
