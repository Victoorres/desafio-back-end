package br.com.desafiobackend.domain.tool;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tools")
public class ToolController {

    @Autowired
    private ToolRepository toolRepository;

    @GetMapping(path = "")
    public ResponseEntity<?> findAllTools(){
        return new ResponseEntity<>(toolRepository.findAll(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity findTool(@PathVariable("id") long id){
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
}
