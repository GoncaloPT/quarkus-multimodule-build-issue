package pt.goncalo.quarkus.multimodule.issue;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DummyServiceImpl implements DummyService{
    @Override
    public String getImplementationName() {
        //return "DummyServiceImpl";
        return "anotherOne";
    }
}
