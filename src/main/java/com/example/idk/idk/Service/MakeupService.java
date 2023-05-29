package com.example.idk.idk.Service;

import com.example.idk.idk.Entity.Makeup;
import com.example.idk.idk.Repository.MakeupRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MakeupService {
    private MakeupRepository makeupRepository;

    public List<Makeup> getAllMakeup() {
        return makeupRepository.findAll();
    }

    public MakeupService(MakeupRepository makeupRepository) {
        this.makeupRepository = makeupRepository;
    }
}
