package pet.project.numapapi.service;

import pet.project.numapapi.entity.Block;
import pet.project.numapapi.entity.repository.BlockRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlockService {

    private final BlockRepository blockRepository;

    // Constructor injection
    public BlockService(BlockRepository blockRepository) {
        this.blockRepository = blockRepository;
    }

    public List<Block> getAllBlocks() {
        return blockRepository.findAll();
    }

    public Optional<Block> getBlockById(Long id) {
        return blockRepository.findById(id);
    }

    public Block createBlock(Block block) {
        return blockRepository.save(block);
    }

    public Optional<Block> updateBlock(Long id, Block updatedBlock) {
        return blockRepository.findById(id).map(existingBlock -> {
            existingBlock.setName(updatedBlock.getName());
            // Update other fields if needed
            return blockRepository.save(existingBlock);
        });
    }

    public boolean deleteBlock(Long id) {
        if (blockRepository.existsById(id)) {
            blockRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
