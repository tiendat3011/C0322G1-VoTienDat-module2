package case_study.services.impl;

import case_study.models.contract.Contract;
import case_study.services.PromotionService;
import case_study.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class PromotionServiceImpl implements PromotionService {
    public List<Contract> contractList = getContractList();

    public List<Contract> getContractList() {
        List<Contract> contractList = new ArrayList<>();
        List<String[]> list = ReadAndWrite.read("src\\case_study\\data\\contract.csv");
        for (String[] item : list) {
            contractList.add(new Contract(Integer.parseInt(item[0]),
                    item[1],
                    Integer.parseInt(item[2]),
                    Double.parseDouble(item[3]),
                    Double.parseDouble(item[4]),
                    item[5],
                    item[6]));
        }
        return contractList;
    }

    @Override
    public void displayCustomerUseService() {
        contractList = getContractList();

    }

    @Override
    public void displayDiscount() {

    }
}
