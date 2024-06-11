#include <stdio.h>
#include <stdlib.h>

// Define a node structure for binary tree
struct TreeNode {
    int data;
    struct TreeNode* left;
    struct TreeNode* right;
};

// Define a binary tree structure
struct BinaryTree {
    struct TreeNode* root;
};

struct TreeNode* createNode(int value) {
    struct TreeNode* newNode = (struct TreeNode*) malloc(sizeof(struct TreeNode));
    if (newNode == NULL) {
        printf("Memory allocation failed\n");
        exit(1);
    }
    newNode->data = value;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

void insertNode(struct TreeNode** root, int value) {
    if (*root == NULL) {
        *root = createNode(value);
    } else {
        if (value < (*root)->data) {
            insertNode(&((*root)->left), value);
        } else {
            insertNode(&((*root)->right), value);
        }
    }
}

struct TreeNode* findMinNode(struct TreeNode* root) {
    if (root == NULL) return NULL;
    
    struct TreeNode* current = root;
    while (current->left != NULL) {
        current = current->left;
    }
    return current;
}

struct TreeNode* deleteNode(struct TreeNode* root, int value) {
    if (root == NULL) return root;
    
    // Find the node to be deleted
    if (value < root->data) {
        root->left = deleteNode(root->left, value);
    } else if (value > root->data) {
        root->right = deleteNode(root->right, value);
    } else {
        // Node found, delete it
        
        // Case 1: Node has no children (leaf node or root with no children)
        if (root->left == NULL && root->right == NULL) {
            free(root);
            root = NULL;
        }
        // Case 2: Node has one child
        else if (root->left == NULL) {
            struct TreeNode* temp = root;
            root = root->right;
            free(temp);
        } else if (root->right == NULL) {
            struct TreeNode* temp = root;
            root = root->left;
            free(temp);
        }
        // Case 3: Node has two children
        else {
            struct TreeNode* minRight = findMinNode(root->right);
            root->data = minRight->data;
            root->right = deleteNode(root->right, minRight->data);
        }
    }
    
    return root;
}

void inorderTraversal(struct TreeNode* root) {
    if (root != NULL) {
        inorderTraversal(root->left);
        printf("%d ", root->data);
        inorderTraversal(root->right);
    }
}

int main() {
    struct BinaryTree tree;
    tree.root = NULL;
    
    // Insert elements into the binary tree
    insertNode(&(tree.root), 50);
    insertNode(&(tree.root), 30);
    insertNode(&(tree.root), 20);
    insertNode(&(tree.root), 40);
    insertNode(&(tree.root), 70);
    insertNode(&(tree.root), 60);
    insertNode(&(tree.root), 80);
    
    printf("Binary tree after insertions (inorder traversal):\n");
    inorderTraversal(tree.root);
    printf("\n\n");
    
    // Delete elements from the binary tree and display after each deletion
    tree.root = deleteNode(tree.root, 20);
    printf("Binary tree after deleting 20 (inorder traversal):\n");
    inorderTraversal(tree.root);
    printf("\n\n");
    
    tree.root = deleteNode(tree.root, 30);
    printf("Binary tree after deleting 30 (inorder traversal):\n");
    inorderTraversal(tree.root);
    printf("\n\n");
    
    tree.root = deleteNode(tree.root, 50);
    printf("Binary tree after deleting 50 (inorder traversal):\n");
    inorderTraversal(tree.root);
    printf("\n\n");
    
    return 0;
}