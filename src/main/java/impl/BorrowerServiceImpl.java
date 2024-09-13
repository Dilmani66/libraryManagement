package impl;

import Mapper.BorrowerMapper;
import com.example.library.dto.BorrowerDto;
import com.example.library.entity.Borrower;
import com.example.library.exception.ResourceNotFound;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class BorrowerServiceImpl implements BorrowerService {
    @Override
    public BorrowerDto createBorrower(BorrowerDto borrowerDto){
        Borrower borrower= BorrowerMapper.mapToBorrower(borrowerDto);
        Borrower savedBorrower=borrowerRepository.save(borrower);
        return BorrowerMapper.mapToBorrowerDto(savedBorrower);
    }
    @Override
    public BorrowerDto getBorrowerById(Long BorrowerId) {
        employeeRepository.findById(employeeId);
        .orElseThrow(()->new ResourceNotFound("Employee does not exist with the given id"+employeeId));
        return null;
    }
}
