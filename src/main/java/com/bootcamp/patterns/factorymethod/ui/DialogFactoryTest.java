package com.bootcamp.patterns.factorymethod.ui;

public class DialogFactoryTest {
    public static void main(String[] args) {
        DialogFactory dialogFactory = DialogFactory.newInstance();
        Dialog fancyWebDialog = dialogFactory.createDialog(DialogType.WEB);
        fancyWebDialog.show();
        Dialog darkModeDesktopDialog = dialogFactory.createDialog(DialogType.DESKTOP);
        darkModeDesktopDialog.show();
    }
}
