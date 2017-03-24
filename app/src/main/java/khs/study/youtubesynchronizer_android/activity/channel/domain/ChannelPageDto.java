package khs.study.youtubesynchronizer_android.activity.channel.domain;

import java.util.List;

import khs.study.youtubesynchronizer_android.activity.common.dto.PageDto;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public class ChannelPageDto<Channel> extends PageDto {
    public ChannelPageDto(int page, int size, boolean hasNext, List content) {
        super(page, size, hasNext, content);
    }

    @Override
    public int getPage() {
        return super.getPage();
    }

    @Override
    public void setPage(int page) {
        super.setPage(page);
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(int size) {
        super.setSize(size);
    }

    @Override
    public boolean isHasNext() {
        return super.isHasNext();
    }

    @Override
    public void setHasNext(boolean hasNext) {
        super.setHasNext(hasNext);
    }

    @Override
    public List getContent() {
        return super.getContent();
    }

    @Override
    public void setContent(List content) {
        super.setContent(content);
    }
}
