package com.codeclan.example.filesfoldersservice;

import com.codeclan.example.filesfoldersservice.models.File;
import com.codeclan.example.filesfoldersservice.models.Folder;
import com.codeclan.example.filesfoldersservice.models.User;
import com.codeclan.example.filesfoldersservice.repositories.FileRepository;
import com.codeclan.example.filesfoldersservice.repositories.FolderRepository;
import com.codeclan.example.filesfoldersservice.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesfoldersserviceApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canAddFileToFolderAndCreateUser() {
		User tristan = new User("Tristan");
		userRepository.save(tristan);
		Folder folder = new Folder("codeclan_work", tristan);
		folderRepository.save(folder);
		File file = new File("files_folders_lab", ".java", 200, folder);
		fileRepository.save(file);
	}

}
