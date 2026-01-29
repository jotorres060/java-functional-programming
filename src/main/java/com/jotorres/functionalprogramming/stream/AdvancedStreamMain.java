package com.jotorres.functionalprogramming.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AdvancedStreamMain {
    public static void main(String[] args) {
        System.out.println("=== ADVANCED STREAMS");

        List<ProductDto> products = List.of(
                new ProductDto("MacBook Pro", 1200.0),
                new ProductDto("iPhone 18 Pro Max", 1000.0),
                new ProductDto("Apple Watch", 750.0)
        );

        System.out.println("\n> Products:");
        System.out.println(products);

        System.out.println("\n> map");
        List<String> discountedProducts = products.stream()
                .map((product) -> new ProductDto(product.name(), product.price() * 0.9))
                .map((product) -> String.format("%s: $%.2f", product.name(), product.price()))
                .toList();

        System.out.println(discountedProducts);

        System.out.println("\n> groupingBy");
        Map<String, List<ProductDto>> productsByPrice = products.stream()
                .collect(Collectors.groupingBy(
                        (product) -> product.price() > 800.0 ? "Expensive" : "Cheap"
                ));

        System.out.println(productsByPrice);

        System.out.println("\n> counting");
        Map<String, Long> countingProductsByPrice = products.stream()
                .collect(Collectors.groupingBy(
                        (product) -> product.price() > 800.0 ? "Expensive" : "Cheap",
                        Collectors.counting()
                ));

        System.out.println(countingProductsByPrice);

        System.out.println("\n> reduce");
        Double total = products.stream()
                .map(ProductDto::price)
                .reduce(0.0, Double::sum);

        System.out.println(total);
        System.out.println();

        String productsSummary = products.stream()
                .map((product) -> product.name() + " (" + product.price() + ")")
                .reduce("", (string1, string2) -> string1.isEmpty() ? string2 : string1 + " | " + string2);

        System.out.println(productsSummary);

        System.out.println("\n> toSet");
        Set<Double> onlyPrices = products.stream()
                .map(ProductDto::price)
                .collect(Collectors.toSet());

        System.out.println(onlyPrices);

        System.out.println("\n> toMap");
        Map<String, Double> productsMap = products.stream()
                .collect(Collectors.toMap(
                        ProductDto::name,
                        ProductDto::price
                ));

        System.out.println(productsMap);

        System.out.println("\n> toList");
        List<ProductDto> expensiveProducts = productsMap.entrySet().stream()
                .filter((element) -> element.getValue() > 800.0)
                .map((element) -> new ProductDto(element.getKey(), element.getValue()))
                .toList();

        System.out.println(expensiveProducts);
    }
}
