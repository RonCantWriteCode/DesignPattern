package cn.roncantwritecode.designpattern.filterpattern;

import java.util.List;

/**
 * @author Ron Wu
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
