/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.kke.jsfbacklog;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;

/**
 *
 * @author kikuta
 */
@Named(value = "backlogBean")
@ViewScoped
public class BacklogBean implements Serializable{

    @Getter
    private List<String> listProject;
    
    @Getter
    private List<Ticket> listTicket;
    
    @Getter
    private List<String> listTheme;
    
    public BacklogBean(){
        listTicket = new ArrayList<>();
        listProject = new ArrayList<>();
        listTheme = Arrays.asList(
                "afterdark", "afternoon", "afterwork", "aristo",
                "black-tie", "blitzer", "bluesky", "bootstrap", 
                "casablanca", "cupertino", "cruze", 
                "dark-hive", "delta", "dot-luv", 
                "eggplant", "excite-bike",
                "flick", "glass-x", "home", "hot-sneaks", "humanity",
                "le-frog", "metroui", "midnight", "mint-choc",
                "overcast", "pepper-grinder", "redmond", "rocket", 
                "sam", "smoothness", "south-street", "start", "sunny", "swanky-purse",
                "trontastic", "ui-darkness", "ui-lightness", "vader");
        IntStream.range(0, 10)
                .forEach(i -> listProject.add("堀北真希さん応援プロジェクト" + i));
        IntStream.range(0, 100)
                .forEach(i -> listTicket.add(new Ticket("MAKI-" + i, 0 , "堀北さんかわいすぎる問題")));
    }
}
