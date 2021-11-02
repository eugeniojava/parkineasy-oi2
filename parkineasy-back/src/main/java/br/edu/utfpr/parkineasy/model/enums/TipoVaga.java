package br.edu.utfpr.parkineasy.model.enums;

import java.util.HashMap;
import java.util.Map;

public enum TipoVaga {
    COMUM(1),
    DEFICIENTE(2),
    IDOSO(3);

    private int value;
    private static Map map = new HashMap<>();

    private TipoVaga(int value) {
        this.value = value;
    }

    static {
        for (TipoVaga tipoVaga : TipoVaga.values()) {
            map.put(tipoVaga.value, tipoVaga);
        }
    }

    public static TipoVaga valueOf(int tipoVaga) {
        return (TipoVaga) map.get(tipoVaga);
    }

    public int getValue() {
        return value;
    }
}


