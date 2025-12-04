# Converter App  
This App performs the below conversions,
1. Length Converter (Meters ↔ Kilometers)
2. Weight Converter (Kilograms ↔ Grams)
3. Time Converter (Hours ↔ Minutes)
4. Temperature Converter (Celsius ↔ Fahrenheit)
5. Currency Converter (SEK ↔ USD)
6. Grade Converter (Percentage → Letter grade)
7. Exit

```
START
    REPEAT
        READ options
        SWITCH
            case 1: perform length conversion and PRINT the result
            case 2: perform weight conversion and PRINT the result
            case 3: perform time conversion and PRINT the result
            case 4: PRINT Exit Converter App
            default: PRINT choose correct operation
        END SWITCH
    END REPEAT
END