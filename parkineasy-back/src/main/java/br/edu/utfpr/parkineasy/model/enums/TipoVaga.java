package br.edu.utfpr.parkineasy.model.enums;

import java.util.HashMap;
import java.util.Map;

public enum TipoVaga {
    COMUM(1),
    DEFICIENTE(2),
    IDOSO(3);

    private static Map map = new HashMap<>();

    static {
        for (TipoVaga tipoVaga : TipoVaga.values()) {
            map.put(tipoVaga.value, tipoVaga);
        }
    }

    private int value;

    private TipoVaga(int value) {
        this.value = value;
    }

    public static TipoVaga valueOf(int tipoVaga) {
        return (TipoVaga) map.get(tipoVaga);
    }

    public int getValue() {
        return value;
    }
}


