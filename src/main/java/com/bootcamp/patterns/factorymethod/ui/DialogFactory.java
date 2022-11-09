package com.bootcamp.patterns.factorymethod.ui;

public class DialogFactory {
    private static DialogFactory INSTANCE;

    public static DialogFactory newInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DialogFactory();
        }
        return INSTANCE;
    }

    private DialogFactory() {
    }

    public Dialog createDialog(DialogType type) {
        Dialog dialog = null;
        switch (type) {
            case DESKTOP:
                dialog = new DesktopDialog();
                break;
            case WEB:
                dialog = new WebDialog();
        }
        return dialog;
    }
}
