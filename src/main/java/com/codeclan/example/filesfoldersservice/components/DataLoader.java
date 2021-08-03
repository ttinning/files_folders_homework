package com.codeclan.example.filesfoldersservice.components;

import com.codeclan.example.filesfoldersservice.models.File;
import com.codeclan.example.filesfoldersservice.models.Folder;
import com.codeclan.example.filesfoldersservice.models.User;
import com.codeclan.example.filesfoldersservice.repositories.FileRepository;
import com.codeclan.example.filesfoldersservice.repositories.FolderRepository;
import com.codeclan.example.filesfoldersservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        User tristan = new User("Tristan");
        userRepository.save(tristan);
        User aly = new User("Aly");
        userRepository.save(aly);
        User sara = new User("Sara");
        userRepository.save(sara);
        Folder work = new Folder("work_stuff", sara);
        folderRepository.save(work);
        Folder games = new Folder("games", aly);
        folderRepository.save(games);
        Folder photography = new Folder("Photography", tristan);
        folderRepository.save(photography);
        File project = new File("project", ".js", 200, work);
        fileRepository.save(project);
        File game = new File("Witcher 3", ".rom", 52000, games);
        fileRepository.save(game);
        File picture = new File("Skyline", ".jpeg", 10, photography);
        fileRepository.save(picture);
        tristan.addFolder(work);
        tristan.addFolder(photography);
        tristan.addFolder(games);
        userRepository.save(tristan);
        work.addFile(project);
        work.addFile(game);
        folderRepository.save(work);
    }
}
