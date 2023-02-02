package com.java5;

/**
 * 返回类型的协变（Covariant Returns），避免类型转换
 */
public class CovariantReturns {

    public interface Zoo {
        Animal getAnimal();
    }

    public static class ZooImpl implements Zoo {
        public Animal getAnimal(){
            return new AnimalImpl();
        }
    }

    public interface Animal{

    }

    public static class AnimalImpl implements Animal{

        public void implMethod(){
            System.out.println("AnimalImpl.implMethod");
        }
    }

    // 从1.5开始，支持返回类型协变---------------------------------
    public static class ZooImpl2 implements Zoo {
        // 将返回类型 Animal 改成 AnimalImpl
        public AnimalImpl getAnimal(){
            return new AnimalImpl();
        }
    }

    public static void main(String[] args) {
        ((AnimalImpl)new ZooImpl().getAnimal()).implMethod();
        new ZooImpl2().getAnimal().implMethod();
    }

}
