public record Moneda(String result, double time_last_update_unix,
                     double time_next_update_unix,
                     String time_last_update_utc,
                     String base_code, double conversion_rates) {
}
