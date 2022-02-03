package dto;

import dao.Programmer;
import dao.Project;
import dao.Repository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
public class IssueDTO {
    private String id;
    private String title;
    private String text;
    private Date date;
    private Set<Programmer> programmers;
    private Project project;
    private Repository repository;

    public String basicToString() {
        return "IssueDTO{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", date=" + date +
                ", project=" + project.basicToString() +
                ", repository=" + repository.basicToString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IssueDTO issueDTO = (IssueDTO) o;
        return Objects.equals(id, issueDTO.id);
    }
}
