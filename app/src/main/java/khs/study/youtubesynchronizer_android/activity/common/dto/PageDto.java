package khs.study.youtubesynchronizer_android.activity.common.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public class PageDto<T> implements Serializable {
    private int page;
    private int size;
    private boolean hasNext;
    private List<T> content;


}
