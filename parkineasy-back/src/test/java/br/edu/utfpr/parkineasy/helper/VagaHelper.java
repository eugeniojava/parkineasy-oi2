package br.edu.utfpr.parkineasy.helper;

import br.edu.utfpr.parkineasy.dto.request.VagaRequest;
import br.edu.utfpr.parkineasy.model.Vaga;

public class VagaHelper {
    public static Vaga umaVaga() {
        return new Vaga("A01",1);
    }

    public static VagaRequest umVagaRequestInvalido() {
        return new VagaRequest("A02",1);
    }

    public static VagaRequest umVagaRequest() {
        return new VagaRequest("A01",1);
    }

    public static VagaRequest outroVagaRequest() {
        return new VagaRequest("C05",3);
    }
}
