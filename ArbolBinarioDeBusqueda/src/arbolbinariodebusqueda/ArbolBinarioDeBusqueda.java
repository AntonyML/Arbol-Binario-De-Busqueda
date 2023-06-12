package arbolbinariodebusqueda;

public class ArbolBinarioDeBusqueda {

    private Nodo root;

    public ArbolBinarioDeBusqueda() {
        root = null;
    }
/// ingrsdamos los datos de la llave, nombre, carnet y carrera

    public void insert(int key, String n, String c, String r) {
        root = insertRec(root, key, n, c, r);
    }

    private Nodo insertRec(Nodo root, int key, String n, String c, String r) {
        if (root == null) {
            root = new Nodo(key, n, c, r);
            return root;
        }

        if (key < root.getKey()) {
            root.setLeft(insertRec(root.getLeft(), key, n, c, r));
        } else if (key > root.getKey()) {
            root.setRight(insertRec(root.getRight(), key, n, c, r));
        }

        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Nodo node) {
        if (node != null) {
            inorderRec(node.getLeft());
            System.out.print(node.getKey() + " ");
            inorderRec(node.getRight());
        }
    }

    public void preorder() {
        preorderRec(root);
    }

    private void preorderRec(Nodo node) {
        if (node != null) {
            System.out.print(node.getKey() + " ");
            preorderRec(node.getLeft());
            preorderRec(node.getRight());
        }
    }

    public void postorder() {
        postorderRec(root);
    }

    private void postorderRec(Nodo node) {
        if (node != null) {
            postorderRec(node.getLeft());
            postorderRec(node.getRight());
            System.out.print(node.getKey() + " ");
        }
    }

    public void printTreeJerarquia() {
        printTreeRec(root, 0);
    }

    private void printTreeRec(Nodo node, int level) {
        if (node != null) {
            printTreeRec(node.getRight(), level + 1);

            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }

            if (level > 0) {
                System.out.print("|---");
            }

            System.out.println(node.getKey());

            printTreeRec(node.getLeft(), level + 1);
        }
    }

    public void printTree() {
        imprimirEntreConNivel(root, 0);
    }

    private void imprimirEntreConNivel(Nodo tmp, int nivel) {
        if (tmp != null) {
            imprimirEntreConNivel(tmp.getLeft(), nivel + 1);

            for (int i = 0; i < nivel; i++) {
                System.out.print("    ");
            }

            System.out.println(tmp.getKey() + "(" + nivel + ") - ");

            imprimirEntreConNivel(tmp.getRight(), nivel + 1);
        }
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Nodo deleteRec(Nodo root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.getKey()) {
            root.setLeft(deleteRec(root.getLeft(), key));
        } else if (key > root.getKey()) {
            root.setRight(deleteRec(root.getRight(), key));
        } else {
            // Caso 1: El nodo a borrar es una hoja (no tiene hijos)
            if (root.getLeft() == null && root.getRight() == null) {
                root = null;
            } // Caso 2: El nodo a borrar tiene un solo hijo
            else if (root.getLeft() == null) {
                root = root.getRight();
            } else if (root.getRight() == null) {
                root = root.getLeft();
            } // Caso 3: El nodo a borrar tiene dos hijos
            else {
                Nodo successor = findMin(root.getRight()); // Encontrar el sucesor del nodo
                root.setKey(successor.getKey());
                root.setName(successor.getName());
                root.setCarnet(successor.getCarnet());
                root.setCarrera(successor.getCarrera());
                root.setRight(deleteRec(root.getRight(), successor.getKey()));
            }
        }

        return root;
    }

    private Nodo findMin(Nodo node) {
        if (node.getLeft() == null) {
            return node;
        }
        return findMin(node.getLeft());
    }

    public int getSize() {
        return getSizeRec(root);
    }

    public int getSizeRec(Nodo node) {
        if (node == null) {
            return 0;
        } else {
            int leftSize = getSizeRec(node.getLeft());
            int rightSize = getSizeRec(node.getRight());
            return leftSize + rightSize + 1;
        }
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }
}
