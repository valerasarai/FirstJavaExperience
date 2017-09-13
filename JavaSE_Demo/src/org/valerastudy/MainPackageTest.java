package org.valerastudy;

import com.valerastudy.Mug;
import org.apache.commons.lang3.StringUtils;

public class MainPackageTest {
    public static void main(String[] args) {
        Mug mugvs = new Mug("Cana", 1);
        com.lexxstudy.Mug mugls = new com.lexxstudy.Mug();
        String textul = "Nu ma zaibi!";

        textul = StringUtils.replace(textul,"Nu", "Da");
        System.out.printf(textul);

    }
}
