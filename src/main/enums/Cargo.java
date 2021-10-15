package main.enums;

public enum Cargo {
    ASSSINTE{
        public Cargo proximoCargo(){ return EFETIVO; }
    },
    EFETIVO{
        public Cargo proximoCargo(){
            return PLENO;
        }
    },
    PLENO{
        public Cargo proximoCargo(){
            return GERENTE;
        }
    },
    GERENTE {
        public Cargo proximoCargo(){
            return GERENTE;
        }
    };

    public abstract Cargo proximoCargo();
}
