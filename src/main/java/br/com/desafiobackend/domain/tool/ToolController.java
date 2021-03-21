package br.com.desafiobackend.domain.tool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tools")
public class ToolController {

    @Autowired
    private ToolRepository toolRepository;

    @GetMapping("/{id}")
    public ResponseEntity findToolById(@PathVariable("id") long id){
        return toolRepository.findById(id)
                .map(response -> ResponseEntity.ok().body(response))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Tool saveTool(@RequestBody Tool tool){
        return toolRepository.save(tool);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTool(@PathVariable("id") long id){
        toolRepository.deleteById(id);
    }

    @GetMapping("")
    @ResponseBody
    public List<Tool> findToolByTag(@RequestParam(required = false) @PathVariable("tag") String tag){
        List<Tool> tools = toolRepository.findAll();
        return tag == null ? tools : toolRepository.findToolByTag(tag);
    }
}
