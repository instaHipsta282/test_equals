import dto.Operation;
import dto.RequestSla;
import dto.RestrictionType;
import dto.Sla;
import dto.SlaGroup;
import dto.TargetType;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {

        SlaGroup x = RequestSla.builder()
                .requestName("request")
                .transactionName("transaction")
                .slaList(asList(Sla.builder()
                        .operation(Operation.GREATER_THEN)
                        .restrictionType(RestrictionType.THROUGHPUT)
                        .value(100.0).build()
                ))
                .targetType(TargetType.TEST)
                .build();

        SlaGroup x_negative = RequestSla.builder()
                .requestName("request")
                .transactionName("noitcasnart")
                .slaList(asList(Sla.builder()
                        .operation(Operation.GREATER_THEN)
                        .restrictionType(RestrictionType.THROUGHPUT)
                        .value(100.0).build()
                ))
                .targetType(TargetType.TEST)
                .build();

        SlaGroup x_only_base_fields = RequestSla.builder()
                .slaList(asList(Sla.builder()
                        .operation(Operation.GREATER_THEN)
                        .restrictionType(RestrictionType.THROUGHPUT)
                        .value(100.0).build()
                ))
                .targetType(TargetType.TEST)
                .build();

        SlaGroup y = RequestSla.builder()
                .requestName("request")
                .transactionName("transaction")
                .slaList(asList(Sla.builder()
                        .operation(Operation.GREATER_THEN)
                        .restrictionType(RestrictionType.THROUGHPUT)
                        .value(100.0).build()
                ))
                .targetType(TargetType.TEST)
                .build();

        SlaGroup z = RequestSla.builder()
                .requestName("request")
                .transactionName("transaction")
                .slaList(asList(Sla.builder()
                        .operation(Operation.GREATER_THEN)
                        .restrictionType(RestrictionType.THROUGHPUT)
                        .value(100.0).build()
                ))
                .targetType(TargetType.TEST)
                .build();

        // • Reflexive: For any non-null reference value x, x.equals(x) must return true.
        System.out.println("Reflexive: " + x.equals(x));

        // • Symmetric: For any non-null reference values x and y, x.equals(y) must return true if and only if y.equals(x) returns true.
        System.out.println("Symmetric: x eq y = " + x.equals(y) + " : y eq x = " + y.equals(x));

        // • Symmetric - x_only_base_fields has only superclass fields
        System.out.println("Negative Symmetric: x eq x_only_base_fields = " + x.equals(x_only_base_fields) + " : x_only_base_fields eq x = " + x_only_base_fields.equals(x));

        // • Transitive: For any non-null reference values x, y, z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) must return true.
        System.out.println("Transitive: x eq y = " + x.equals(y) + " : y eq z = " + y.equals(x) + " then x eq x = " + x.equals(z));

        // • Transitive - x_negative has not equals field in subclass
        System.out.println("Negative Transitive: x_negative eq y = " + x.equals(x_negative) + " : y eq x_negative = " + x_negative.equals(x));

    }
}
