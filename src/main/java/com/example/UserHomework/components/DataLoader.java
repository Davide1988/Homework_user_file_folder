package com.example.UserHomework.components;

import com.example.UserHomework.models.File;
import com.example.UserHomework.models.Folder;
import com.example.UserHomework.models.User;
import com.example.UserHomework.repositories.FileRepository;
import com.example.UserHomework.repositories.FolderRepository;
import com.example.UserHomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;





    @Override
    public void run(ApplicationArguments args) throws Exception {



        Folder folder = new Folder("Things");
        folderRepository.save(folder);

        User user = new User("Davide");
        userRepository.save(user);

        user.addFolder(folder);
        userRepository.save(user);




        File file = new File("CV", ".doc", 23, folder);
        fileRepository.save(file);

        File file2 = new File("pic", ".jpc", 23, folder);
        fileRepository.save(file2);




//        user.addFolder(folder);
//        userRepository.save(user);



//        folder.addFile(file);
//        folderRepository.save(folder);

//        user.addFolder(folder);
//        userRepository.save(user);


    }
}
