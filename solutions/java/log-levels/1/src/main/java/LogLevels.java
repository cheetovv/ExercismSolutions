public class LogLevels {
    
    public static String message(String logLine) {
        var index = logLine.indexOf(":");
        var mensaje = logLine.substring(index+1);
        mensaje = mensaje.trim();
        return mensaje;
    }

    public static String logLevel(String logLine) {
        var inicio = logLine.indexOf("[");
        var fin = logLine.indexOf("]");
        return logLine.substring(inicio + 1, fin).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
