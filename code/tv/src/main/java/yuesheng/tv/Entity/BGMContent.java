package yuesheng.tv.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "bgm")
public class BGMContent {
    @Id
    private String name;
    private byte[] content;
}
