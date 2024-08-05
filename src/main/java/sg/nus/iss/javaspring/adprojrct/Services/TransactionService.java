package sg.nus.iss.javaspring.adprojrct.Services;

import sg.nus.iss.javaspring.adprojrct.Models.Category;
import sg.nus.iss.javaspring.adprojrct.Models.Transaction;

import java.util.List;
import java.util.Optional;

public interface TransactionService {
    List<Transaction> getAllTransactions();
    Optional<List<Transaction>> getTransactionsByCategoryId(int categoryId);
    Optional<Transaction> getTransactionById(int transactionId);
    Optional<List<Transaction>> getTransactionsByUserId(int userId);

    Transaction addTransaction(Transaction transaction, int userId);
    Transaction updateTransaction(Transaction transaction, int transactionId);
    void deleteTransaction(int transactionId);
    List<Transaction> findTransactionsByOrderDateAtDesc(int userId);

    double getTotalSpendingLastMonth(int userId);
    double getTotalSpendingPreviousMonth(int userId);
    double getTotalSpendingToday(int userId);
    double getTotalSpendingLastWeek(int userId);
    double getTotalSpendingLastYear(int userId);
}
