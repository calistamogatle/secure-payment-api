@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer;

    private String recipientAccount;
    private Double amount;
    private String currency;
    private String swiftCode;
    private String status;
    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters, Setters
}
