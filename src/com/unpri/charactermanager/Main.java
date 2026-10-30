package com.unpri.charactermanager;

import java.util.ArrayList;
import javax.swing.SwingUtilities;
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.view.MainWindow;

public class Main {
    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();

            manager.addCharacter(new Character("Gatot", CharacterType.WARRIOR, 5));
            manager.addCharacter(new Character("Galgadot", CharacterType.MAGE, 3));
            manager.addCharacter(new Character("Angela", CharacterType.ARCHER, 4));
            manager.addCharacter(new Character("Vale", CharacterType.ASSASSIN, 5));
            manager.addCharacter(new Character("Malganis", CharacterType.TANK, 7));

        SwingUtilities.invokeLater(() -> {
            ArrayList<Character> list = manager.getAllCharacters();
            MainWindow window = new MainWindow(list);
            window.setVisible(true);
        });
    }
}