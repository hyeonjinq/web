package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.vo.Sample;

public interface SampleRepository extends JpaRepository<Sample, Integer>{}
