package homework01

fun binarySearch(array: List<Int>, f: Int): Int {
    var begin: Int = 0;
    var end: Int = array.size - 1
    var i: Int = (begin + end) / 2
    while (begin <= end && array[i] != f) {
        if (array[i] > f) {
            end = i - 1
            i = (begin + end) / 2
        } else if (array[i] < f) {
            begin = i + 1
            i = (begin + end) / 2
        }
    }
    if (array[i] != f) {
        return -1
    } else {
        return i
    }
}

fun binarySearch2(array: List<Int>, f: Int): Float {
    var begin: Int = 0;
    var end: Int = array.size - 1
    var i: Int = (begin + end) / 2
    while (begin <= end && array[i] != f) {
        if (array[i] > f) {
            end = i - 1
            i = (begin + end) / 2
        } else if (array[i] < f) {
            begin = i + 1
            i = (begin + end) / 2
        }
    }

    if (array[i] != f) {
        return (begin + end.toFloat()) / 2
    } else {
        return i.toFloat()
    }
}

fun howManyNumbers(array: List<Int>, l: Int, r: Int): Int {
    array.toIntArray().sort()
    var left: Float = binarySearch2(array, l);
    var right: Float = binarySearch2(array, r);
    if (left > left.toInt().toFloat()) {
        return right.toInt() - left.toInt()
    } else {
        return right.toInt() - left.toInt() + 1
    }
}


fun getSumOfPrime(k: Int): Long {
    val array = Array(10001, { i -> 0 })
    for (i in 2..array.size - 1 step 1) {
        if (array[i] == 0) {
            for (j in 2 * i..array.size - 1 step i) {
                array[j] = 1
            }
        }
    }
    var s: Long = 0
    var i: Int = 0
    var j: Int = 2
    while (i != k && j < array.size) {
        if (array[j] == 0) {
            println(j)
            s += j
            i++
        }
        j++
    }
    return s
}

fun countTriples(a: List<Int>, b: List<Int>, c: List<Int>, x: Int): Int {
    a.toIntArray().sort()
    b.toIntArray().sort()
    c.toIntArray().sort()
    var k: Int = 0;
    for (i in 0..a.size - 1) {
        for (j in 0..b.size - 1) {
            if (binarySearch(c, x - (a[i] + b[j])) != -1) {
                k++
            }
        }
    }
    return k;
}

fun findUnique(array: List<Int>): Int {
    var found: Int = 0
    for (i in 0..array.size - 1) {
        found = found.xor(array[i])
    }
    return found
}

fun ternarySearch(array: List<Int>): Int {
    var left: Int = 0
    var right: Int = array.size - 1
    while (right - left > 1) {
        var point1: Int = left + (right - left) / 3
        var point2: Int = left + 2 * (right - left) / 3

        if (array[point1] <= array[point1 + 1] && array[point2] <= array[point2 - 1]) {
            left = point1
            right = point2
        } else if (array[point1] >= array[point1 + 1] && array[point2] <= array[point2 - 1]) {
            right = point1
        } else if (array[point1] <= array[point1 + 1] && array[point2] >= array[point2 - 1]) {
            left = point2
        }
    }
    if (left > 0) {
        if (array[left] > array[left - 1] && array[left] > array[left + 1]) {
            return array[left]
        } else if (right != array.size - 1) {
            if (array[right] > array[right - 1] && array[right] > array[right + 1]) {
                return array[right]
            }
        } else {
            if (array[right] > array[right - 1]) {
                return array[right]
            }
        }
    } else {
        if (array[left] > array[left + 1]) {
            return array[left]
        }
    }
    return 0
}