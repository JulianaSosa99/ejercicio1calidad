package calculadora;

public class CalculadoraDescuentos {

   /* public double aplicarDescuentoPorcentaje(double monto, double porcentaje) {
        return monto - (monto * porcentaje / 100);
    }*/

        public double aplicarDescuentoPorcentaje(double monto, double porcentaje) {
        if (monto < 0 || porcentaje < 0) {
            throw new IllegalArgumentException("Monto y porcentaje deben ser positivos");
        }

        double descuentoCalculado = monto * (porcentaje / 100.0);
        double montoFinal = monto - descuentoCalculado;

        return montoFinal;
    }


}
