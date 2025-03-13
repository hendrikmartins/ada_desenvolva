package br.com.hendrikmartins.ada.desenvolva.modulo3.aula6.versao2;

public enum TipoFrete {
    PADRAO {
        @Override
        public double valorFrete() {
            return 10.0;
        }
    },
    EXPRESSA {
        @Override
        public double valorFrete() {
            return 20.0;
        }
    },
    INTERNACIONAL {
        @Override
        public double valorFrete() {
            return 50.0;
        }
    },
    PRIORITARIA {
        @Override
        public double valorFrete() {
            return 30.0;
        }
    };

    public abstract double valorFrete();
}

