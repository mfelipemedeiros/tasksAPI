package com.mfms.tasks.repository;

import com.mfms.tasks.entity.Task;
import com.mfms.tasks.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository  extends JpaRepository<Task, Long> {
}
