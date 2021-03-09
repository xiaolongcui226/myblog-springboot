package com.mtons.mblog.modules.repository;

import com.mtons.mblog.modules.entity.PostAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by langhsu
 */
public interface PostAttributeRepository extends JpaRepository<PostAttribute, Long>, JpaSpecificationExecutor<PostAttribute> {
}
