@Service
public class PaymentService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction processPayment(Transaction transaction) {
        transaction.setStatus("PROCESSING");
        return transactionRepository.save(transaction);
    }
}
