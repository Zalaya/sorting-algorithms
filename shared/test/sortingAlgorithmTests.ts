import { SortingAlgorithm } from "../src/SortingAlgorithm";

export function sortingAlgorithmTests(sortingAlgorithm: SortingAlgorithm): void {

    describe("Sorting Algorithm Tests", () => {

        it("should sort an empty array", () => {
            const unsortedArray: number[] = [];
            const expectedArray: number[] = [];

            expect(sortingAlgorithm.sort(unsortedArray)).toEqual(expectedArray);
        });

        it("should sort an array with one element", () => {
            const unsortedArray: number[] = [ 1 ];
            const expectedArray: number[] = [ 1 ];

            expect(sortingAlgorithm.sort(unsortedArray)).toEqual(expectedArray);
        });

        it("should sort an array with two elements", () => {
            const unsortedArray: number[] = [ 2, 1 ];
            const expectedArray: number[] = [ 1, 2 ];

            expect(sortingAlgorithm.sort(unsortedArray)).toEqual(expectedArray);
        });

        it("should sort an array with repeated elements", () => {
            const unsortedArray: number[] = [ 2, 1, 2, 1 ];
            const expectedArray: number[] = [ 1, 1, 2, 2 ];

            expect(sortingAlgorithm.sort(unsortedArray)).toEqual(expectedArray);
        });

        it("should sort an already sorted array", () => {
            const unsortedArray: number[] = [ 1, 2, 3, 4, 5 ];
            const expectedArray: number[] = [ 1, 2, 3, 4, 5 ];

            expect(sortingAlgorithm.sort(unsortedArray)).toEqual(expectedArray);
        });

        it("should sort an array in descending order", () => {
            const unsortedArray: number[] = [ 5, 4, 3, 2, 1 ];
            const expectedArray: number[] = [ 1, 2, 3, 4, 5 ];

            expect(sortingAlgorithm.sort(unsortedArray)).toEqual(expectedArray);
        });

        it("should sort an array with negative elements", () => {
            const unsortedArray: number[] = [ -5, -3, -2, -8, -7, -4, -1, -9, -6 ];
            const expectedArray: number[] = [ -9, -8, -7, -6, -5, -4, -3, -2, -1 ];

            expect(sortingAlgorithm.sort(unsortedArray)).toEqual(expectedArray);
        });

        it("should sort an array with positive and negative elements", () => {
            const unsortedArray: number[] = [ -5, 3, -2, 8, -7, 4, -1, 9, -6 ];
            const expectedArray: number[] = [ -7, -6, -5, -2, -1, 3, 4, 8, 9 ];

            expect(sortingAlgorithm.sort(unsortedArray)).toEqual(expectedArray);
        });

    })

}