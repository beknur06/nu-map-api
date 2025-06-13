package pet.project.numapapi.controller;

import pet.project.numapapi.entity.Block;
import pet.project.numapapi.service.BlockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blocks")
@RequiredArgsConstructor
public class BlockController {

    private final BlockService blockService;

    // Get all blocks
    @GetMapping
    public List<Block> getAllBlocks() {
        return blockService.getAllBlocks();
    }

    // Get a single block by ID
    @GetMapping("/{id}")
    public ResponseEntity<Block> getBlockById(@PathVariable Long id) {
        return blockService.getBlockById(id)
                .map(block -> ResponseEntity.ok(block))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create a new block
    @PostMapping
    public ResponseEntity<Block> createBlock(@RequestBody Block block) {
        Block created = blockService.createBlock(block);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    // Update a block
    @PutMapping("/{id}")
    public ResponseEntity<Block> updateBlock(@PathVariable Long id, @RequestBody Block block) {
        return blockService.updateBlock(id, block)
                .map(updated -> ResponseEntity.ok(updated))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Delete a block
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBlock(@PathVariable Long id) {
        if (blockService.deleteBlock(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
