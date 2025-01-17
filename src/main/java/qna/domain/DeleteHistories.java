package qna.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeleteHistories {

    private List<DeleteHistory> deleteHistories = new ArrayList<>();

    protected DeleteHistories() {
    }

    public int size() {
        return deleteHistories.size();
    }

    public void add(DeleteHistory deleteHistory) {
        this.deleteHistories.add(deleteHistory);
    }

    public void addAll(DeleteHistories deleteHistories) {
        this.deleteHistories.addAll(deleteHistories.toList());
    }

    public boolean hasDeleteHistory(DeleteHistory deleteHistory) {
        return deleteHistories.contains(deleteHistory);
    }

    public List<DeleteHistory> toList() {
        return Collections.unmodifiableList(deleteHistories);
    }

}
