interface WorkerInterface extends EatsInterface, WorksInterface {}

interface WorksInterface {
  public void work();
}
interface EatsInterface {
  public void eat();
}
class Worker implements WorksInterface, EatsInterface {
  public void work() {}//Work
  public void eat() {}//Eat
}

class SuperWorker implements WorkerInterface  {
    public void work() {}//More Work
    public void eat() {}//Eat
}

class Robot implements WorksInterface {
  public void work() {}//Work
}

class Manager {
WorkerInterface worker;

public void setWorker(WorkerInterface w) {
 worker=w;
 }
public void manage() {
worker.work();
}
}