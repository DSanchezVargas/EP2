


import java.util.Map;




public class HashMap {
    public static void main(String[] args) {
       

        Map<String, String>persona = null;  //uTILIZAR hascode equals si llave es igual o no, o si se desea buscar a través de valor  por ej: contains value o containskey , utilizar tanto el  hashcode como el equals. Si se busca por Hshcode y detecta que son  iguales el msismo Hashcode, va a llamar al método Equals para verificar si realmente el obj. es igual o no.
        persona.put("nombre", "Aventurine"); //en vez de usar add , para guardar usar put
        persona.put("apellido", "Ratio");
        persona.put("edad", "23");
        persona.put("ocupp", "gambler");
    }
}
