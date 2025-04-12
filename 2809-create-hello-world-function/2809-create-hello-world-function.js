/**
 * @return {Function}
 */
var createHelloWorld = function() {
    const f = "Hello World";
    return function() {
        return f;
    }

};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */