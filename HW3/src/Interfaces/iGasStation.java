package Interfaces;

/**
 * Интерфейс с методами заправочной станции: заправка, очистка лобового стекла, очистка фар, очистка зеркал.
 */
public interface iGasStation {
    void refueling();
    void windshieldCleaning();
    void headlightCleaning();
    void mirrorCleaning();
}
