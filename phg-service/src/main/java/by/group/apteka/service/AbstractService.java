package by.group.apteka.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Date: Mar 13, 2016
 */
@Transactional(rollbackFor = Throwable.class)
public abstract class AbstractService {
}
