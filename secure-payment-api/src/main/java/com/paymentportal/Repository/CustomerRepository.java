public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmail(String email);
}
