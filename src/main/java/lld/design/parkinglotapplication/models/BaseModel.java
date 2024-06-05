package lld.design.parkinglotapplication.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseModel {
    private Long id;
    private Date createdAt;
    private Date lastUpdateAt;
}
