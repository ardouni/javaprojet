package com.example.java;

public class Main {

    public static void main(String[] args) {

        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");

        vertexA.addNeighbour(new Edge(10,vertexA,vertexC));
        vertexA.addNeighbour(new Edge(17,vertexA,vertexB));
        vertexC.addNeighbour(new Edge(5,vertexC,vertexB));
        vertexC.addNeighbour(new Edge(9,vertexC,vertexD));
        vertexC.addNeighbour(new Edge(11,vertexC,vertexE));
        vertexB.addNeighbour(new Edge(1,vertexB,vertexD));
        vertexD.addNeighbour(new Edge(6,vertexD,vertexE));

        DijkstraShortestPath shortestPath = new DijkstraShortestPath();
        //if choose source A
        shortestPath.computeShortestPaths(vertexA);
        //if choose source B
        //shortestPath.computeShortestPaths(vertexB);
        //if choose source C
        //shortestPath.computeShortestPaths(vertexC);
        //if choose source D
        //shortestPath.computeShortestPaths(vertexD);



        // uncomment if choose source A
        System.out.println("======================================");
        System.out.println("Calculating minimum distance");
        System.out.println("======================================");

        System.out.println("Minimum distance from A to B: "+vertexB.getDistance());
        System.out.println("Minimum distance from A to C: "+vertexC.getDistance());
        System.out.println("Minimum distance from A to D: "+vertexD.getDistance());
        System.out.println("Minimum distance from A to E: "+vertexE.getDistance());

        System.out.println("=========================================");
        System.out.println("Calculating Paths");
        System.out.println("=========================================");

        System.out.println("Shortest Path from A to B: "+shortestPath.getShortestPathTo(vertexB));
        System.out.println("Shortest Path from A to C: "+shortestPath.getShortestPathTo(vertexC));
        System.out.println("Shortest Path from A to D: "+shortestPath.getShortestPathTo(vertexD));
        System.out.println("Shortest Path from A to E: "+shortestPath.getShortestPathTo(vertexE));

        // uncomment if choose source B
        //System.out.println("======================================");
        //System.out.println("Calculating minimum distance");
        //System.out.println("======================================");

        //System.out.println("Minimum distance from B to D: "+vertexD.getDistance());
        //System.out.println("Minimum distance from B to E: "+vertexE.getDistance());

        //System.out.println("=======================================");
        //System.out.println("Calculating Paths");
        //System.out.println("=======================================");

        //System.out.println("Shortest Path from B to D: "+shortestPath.getShortestPathTo(vertexD));
        //System.out.println("Shortest Path from B to E: "+shortestPath.getShortestPathTo(vertexE));

        // uncomment if choose source C
        //System.out.println("======================================");
        //System.out.println("Calculating minimum distance");
        //System.out.println("======================================");

        //System.out.println("Minimum distance from C to B: "+vertexB.getDistance());
        //System.out.println("Minimum distance from C to D: "+vertexD.getDistance());
        //System.out.println("Minimum distance from C to E: "+vertexE.getDistance());


        //System.out.println("========================================");
        //System.out.println("Calculating Paths");
        //System.out.println("========================================");

        //System.out.println("Shortest Path from C to B: "+shortestPath.getShortestPathTo(vertexB));
        //System.out.println("Shortest Path from C to D: "+shortestPath.getShortestPathTo(vertexD));
        //System.out.println("Shortest Path from C to E: "+shortestPath.getShortestPathTo(vertexE));

        // uncomment if choose source D
        //System.out.println("======================================");
        //System.out.println("Calculating minimum distance");
        //System.out.println("======================================");

        //System.out.println("Minimum distance from D to E: "+vertexE.getDistance());


        //System.out.println("=======================================");
        //System.out.println("Calculating Paths");
        //System.out.println("=======================================");

        //System.out.println("Shortest Path from D to E: "+shortestPath.getShortestPathTo(vertexE));

    }
}
