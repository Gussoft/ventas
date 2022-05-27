package com.gussoft.config;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;

import javax.swing.*;

public class Sugerencias {

    public void cargarSugerenciasCB(JComboBox comboBox) {
        AutoCompleteDecorator.decorate(comboBox);
    }

    public void cargarSugerenciasJT(JTextField textField, JList lista) {
        AutoCompleteDecorator.decorate(lista, textField, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);
    }
}
