package Mapper;

import com.example.library.dto.BorrowerDto;
import com.example.library.entity.Borrower;

public class BorrowerMapper {
    public static BorrowerDto mapToBorrowerDto(Borrower borrower) {
        return new BorrowerDto(
                borrower.getBorrowerId(),
                borrower.getName(),
                borrower.getEmail(),
                borrower.getMembershipType()
        );
    }
}
