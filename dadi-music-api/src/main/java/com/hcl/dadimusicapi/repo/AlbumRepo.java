package com.hcl.dadimusicapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.dadimusicapi.model.Album;
@Repository
public interface AlbumRepo extends JpaRepository<Album, Integer> {

}
