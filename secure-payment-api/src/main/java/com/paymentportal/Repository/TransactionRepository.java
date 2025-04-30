public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByCustomer(Customer customer);
}
