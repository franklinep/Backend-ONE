public class Conversor {
    String base_code;
    String target_code;
    String conversion_rate;

    public Double getConversionRate(){
        return Double.parseDouble(this.conversion_rate);
    }

    @Override
    public String toString() {
        return "Base Code: " + this.base_code +
        "\nTarget Code: " + this.target_code +
        "\nConversion Rate: " + this.conversion_rate;
    }
}
