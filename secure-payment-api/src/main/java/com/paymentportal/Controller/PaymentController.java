@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/make")
    public ResponseEntity<Transaction> makePayment(@RequestBody Transaction transaction) {
        Transaction savedTransaction = paymentService.processPayment(transaction);
        return ResponseEntity.ok(savedTransaction);
    }
}
