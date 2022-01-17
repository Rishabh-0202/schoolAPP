package com.example.school.Service;

import com.example.school.Entities.Development;
import com.example.school.Entities.Expense;
import com.example.school.Respository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> getallExpense()
    {
        return expenseRepository.findAll();
    }
    public Optional<Expense> getExpensebyId(int id)
    {
        return expenseRepository.findById(id);
    }

    public Expense add(Expense expense)
    {
        return expenseRepository.save(expense);
    }
    public Expense update(Expense expense)
    {
        return expenseRepository.save(expense);
    }
    public void delete(int id)
    {
        Expense del= expenseRepository.getOne(id);
        expenseRepository.delete(del);
    }

}
