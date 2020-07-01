package at.nacs.apptruistic.domain;

import lombok.Data;

import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Event {

  private String id;

  @NotEmpty
  @NotNull
  private String what;

  @FutureOrPresent
  @NotEmpty
  @NotNull
  private LocalDateTime when;

  @Future
  @NotEmpty
  @NotNull
  private LocalDateTime deadline;

  @NotEmpty
  @NotNull
  private String location;


  private List<String> filters = new ArrayList<>();


  private List<String> skills = new ArrayList<>();


  @NotEmpty
  @NotNull
  private String contact;
  
  @NotEmpty
  @NotNull
  private Integer capacity;
}
