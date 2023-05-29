package com.example.makeup.makeup.Service;

import com.example.makeup.makeup.Entity.Makeup;
import com.example.makeup.makeup.Repository.MakeupRepository;
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
