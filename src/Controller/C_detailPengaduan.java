/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.V_akun;
import View.V_detailPengaduan;
import View.V_eventUser;
import View.V_histoyPengaduan;
import View.V_homeUser;
import View.V_login;
import View.V_pengaduan;
import View.V_prosesPengaduan;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author GeGa
 */
public class C_detailPengaduan {
    View.V_detailPengaduan views;
    
    public C_detailPengaduan(V_detailPengaduan views){
        this.views = views;
        this.views.setVisible(true);
        this.views.klikEvent(new tblEvent());
        this.views.klikHome(new tblHome());
        this.views.klikLogout(new tblLogout());
        this.views.klikSetting(new tblSetting());
        this.views.klikProsesPengaduan(new tblProsesPengaduan());
        this.views.klikTambahPengaduan(new tblTambahPengaduan());
        this.views.klikHistoryPengaduan(new tblHistoryPengaduan());        
    }
    
    private class tblEvent extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_eventUser event = new Controller.C_eventUser(new V_eventUser());
            views.setVisible(false);
            
        }
    }

    private class tblHome extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_homeUser home = new Controller.C_homeUser(new V_homeUser());
            views.setVisible(false);
            
        }
    }

    private class tblLogout extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_login logout = new Controller.C_login(new V_login());
            views.setVisible(false);
            
        }
    }

    private class tblSetting extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_akun setting = new Controller.C_akun(new V_akun());
            views.setVisible(false);
            
        }
    }

    private class tblProsesPengaduan extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_prosesPengaduan prosesPengaduan = new Controller.C_prosesPengaduan(new V_prosesPengaduan());
            views.setVisible(false);
            
        }
    }

    private class tblHistoryPengaduan extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_historyPengaduan historyPengaduan = new Controller.C_historyPengaduan(new V_histoyPengaduan());
            views.setVisible(false);
            
        }
    }
    
    private class tblTambahPengaduan extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_pengaduan tambahPengaduan = new Controller.C_pengaduan(new V_pengaduan());
            views.setVisible(false);
            
        }
    }
}
