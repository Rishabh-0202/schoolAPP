package com.example.school.Controller;

import com.example.school.Entities.Development;
import com.example.school.Entities.Expense;
import com.example.school.Service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ExpenseResource {

    @Autowired
    private ExpenseService expenseService;

    public ExpenseResource(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/expense")
    public List<Expense> getallexpenses()
    {
        return expenseService.getallExpense();
    }

    @GetMapping("/expense/{id}")
    public Optional<Expense> getExpensebyId(@RequestBody int id)
    {
        return expenseService.getExpensebyId(id);
    }

    @PostMapping("/expense/register")
    public Expense register(@RequestBody Expense expense)
    {
        return expenseService.add(expense);
    }

    @PutMapping("/expense/update")
    public Expense update(@RequestBody Expense expense)
    {
        return expenseService.update(expense);
    }
    @DeleteMapping("/expense/delete/{id}")
    public void delete(@RequestBody int id)
    {
        expenseService.delete(id);
    }
}
