package com.springlearner.bootstrap;

import com.springlearner.model.Owner;
import com.springlearner.model.Vet;
import com.springlearner.services.OwnerService;
import com.springlearner.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Sanjay");
        owner1.setLastName("Jeyachandran");

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Bala");
        owner2.setLastName("Venkatesh");

        ownerService.save(owner2);

        System.out.println("Saved Owner objects");

        Vet vet1=new Vet();
        vet1.setId(3L);
        vet1.setFirstName("Giri");
        vet1.setLastName("Sethumadhavan");

        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setId(3L);
        vet2.setFirstName("Prabakaran");
        vet2.setLastName("Babu");

        vetService.save(vet2);

        System.out.println("Saved Vet objects");




    }
}
