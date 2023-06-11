// https://github.com/norahiko/sort-visualize

var helper = {
    range: function(min, max) {
        var res = [];
        for(var i = min; i < max; i++) {
            res.push(i);
        }
        return res;
    },

    shuffle: function(ary) {
        for(var i = ary.length - 1; 0 <= i; i--) {
            var rnd = Math.random() * (i + 1) | 0;
            helper.swap(ary, i, rnd);
        }
    },

    swap: function(ary, a, b) {
        if(a < 0 || b < 0 || ary.length <= a || ary.length <= b) {
            throw new Error('IndexError ' + a + " - " + b);
        }
        var temp = ary[a];
        ary[a] = ary[b];
        ary[b] = temp;
    },

    insert: function(ary, from, to) {
        while(from != to) {
            if(from < to) {
                helper.swap(ary, from, from + 1);
                from += 1;
            } else {
                helper.swap(ary, from, from - 1);
                from -= 1;
            }
        }
    },

    median3: function(a, b, c) {
        if(b <= a)
            if (a <= c)
                return a;
            else if(c <= b)
                return b;
            else
                return c;
        else if(c <= a)
            return a;
        else if(c <= b)
            return c;
        else
            return b;
    },

    getCanvas: function(id) {
        var canvas = document.getElementById(id);
        if(canvas === null || canvas.nodeName.toLowerCase() !== 'canvas') {
            return document.createElement('canvas');
        }
        return canvas;
    }
};


var graph = {};

(function() {
    var canvas;
    var ctx;
    var width;
    var height;

    var bgColor = '#333';
    var barColor = '#6cf';
    var highlightColor = '#cf6';

    graph.init = function(c) {
        canvas = c;
        ctx = canvas.getContext('2d');
        width = canvas.offsetWidth;
        height = canvas.offsetHeight;
    };

    graph.draw = function(highlightIndexes, values) {
        ctx.fillStyle = bgColor;
        ctx.fillRect(0, 0, width, height);
        var idx1 = highlightIndexes[0];
        var idx2 = highlightIndexes[1];

        var size = values.length;
        var barWidth = (width - size + 1) / size;
        var barHeightUnit = height / size;

        var x = 0;
        var h = 0;
        ctx.fillStyle = barColor;
        for(var i = 0; i < values.length; i++) {
            h = values[i] * barHeightUnit;
            if(i === idx1 || i === idx2) {
                ctx.fillStyle = highlightColor;
                ctx.fillRect(x, height- h, barWidth, h);
                ctx.fillStyle = barColor;
            } else {
                ctx.fillRect(x, height- h, barWidth, h);
            }
            x = x + barWidth + 1;
        }
    };
})();


function SortStep(type, indexes) {
    // type = 'swap' | 'highlight' | 'insert'
    this.type = type;
    // アニメーション時にハイライトさせるインデックスの配列
    this.indexes = indexes;
}

SortStep.SWAP = 'swap';
SortStep.HIGHLIGHT = 'highlight';
SortStep.INSERT = 'insert';

SortStep.prototype.run = function(ary) {
    if(this.type === SortStep.SWAP) {
        helper.swap(ary, this.indexes[0], this.indexes[1]);
    } else if(this.type === SortStep.INSERT) {
        helper.insert(ary, this.indexes[0], this.indexes[1]);
        this.indexes[0] = -1;
    }
};


function SortAlgorithm(values) {
    this.values = values;
    this.size = values.length;
    this.steps = [];
    this.finished = false;
}


SortAlgorithm.prototype.sort = function(algorithm) {
    this[algorithm]();
    this.steps.reverse();
    // ボゴソートはソートが完了せずに終了する
    if(algorithm !== 'bogo') {
        this.finished = true;
    }
};

SortAlgorithm.prototype.addStep = function(type, indexes) {
    this.steps.push(new SortStep(type, indexes));
};

SortAlgorithm.prototype.swap = function(a, b) {
    helper.swap(this.values, a, b);
    this.addStep(SortStep.SWAP, [a, b]);
};

SortAlgorithm.prototype.highlight = function(a, b) {
    this.addStep(SortStep.HIGHLIGHT, [a, b]);
};

SortAlgorithm.prototype.insert = function(from, to) {
    helper.insert(this.values, from, to);
    this.addStep(SortStep.INSERT, [from, to]);
};

SortAlgorithm.prototype.bubble = function bubbleSort() {
    for(var i = this.size - 1; 0 < i; i--) {
        for(var k = 0; k < i; k++) {
            if(this.values[k] > this.values[k + 1]) {
                this.swap(k, k + 1);
            } else {
                this.highlight(k, k + 1);
            }
        }
    }
};

SortAlgorithm.prototype.selection = function selectionSort() {
    for(var i = 0; i < this.size - 1; i++) {
        var min = i;
        for(var k = i + 1; k < this.size; k++) {
            this.highlight(min, k);
            if(this.values[k] < this.values[min]) {
                min = k;
            }
        }
        this.swap(i, min);
    }
};

SortAlgorithm.prototype.shaker = function shakerSort() {
    var left = 0;
    var right = this.size - 1;
    var incr = 1;
    var i = 0;
    var next;
    var lastSwapped = 0;

    var count = 0;
    while(left < right) {
        next = i + incr;
        if((incr === 1 && this.values[i] > this.values[next]) || (incr === -1 && this.values[next] > this.values[i])) {
            this.swap(i, next);
            lastSwapped = i;
        } else {
            this.highlight(i, next);
        }

        if(next === right) {
            i = right = lastSwapped;
            incr = -incr;
        } else if(next === left) {
            i = left = lastSwapped;
            incr = -incr;
        } else {
            i = next;
        }
    }
};

SortAlgorithm.prototype.insertion = function insertionSort() {
    for(var i = 1; i < this.size; i++) {
        for(var k = i; 0 < k; k--) {
            if(this.values[k - 1] > this.values[k]) {
                this.swap(k - 1, k);
            } else {
                this.highlight(k - 1, k);
                break;
            }
        }
    }
};

SortAlgorithm.prototype.shell = function shellSort() {
    var gap = 1;
    while(gap < this.size) {
        gap = gap * 3 + 1;
    }

    while(1 < gap) {
        gap = gap / 3 | 0;
        for(var i = gap; i < this.size; i++) {
            for(var k = i; 0 < k; k -= gap) {
                if(this.values[k - gap] > this.values[k]) {
                    this.swap(k - gap, k);
                } else {
                    this.highlight(k - gap, k);
                    break;
                }
            }
        }
    }
};

SortAlgorithm.prototype.merge = function mergeSort() {
    this.mergeSortImpl(0, this.size - 1);
};

SortAlgorithm.prototype.mergeSortImpl = function(left, right) {
    if(right <= left) {
        return;
    }
    var middle = (left + right) / 2 | 0;
    this.mergeSortImpl(left, middle);
    this.mergeSortImpl(middle + 1, right);

    var l = left;
    var m = middle + 1;
    while(l < m && m <= right) {
        this.highlight(l, m);
        if(this.values[l] >= this.values[m]) {
            this.insert(m, l);
            m++;
        }
        l++;
    }
};

SortAlgorithm.prototype.quick = function quickSort() {
    this.quickSortImpl(0, this.size - 1);
};

SortAlgorithm.prototype.quickSortImpl = function(left, right) {
    var values = this.values;
    var middle = (left + right) / 2 | 0;
    var pivot = helper.median3(values[left], values[middle], values[right]);
    var l = left;
    var r = right;
    while(true) {
        while(values[l] < pivot) {
            this.highlight(l, r);
            l++;
        }
        while(pivot < values[r]) {
            this.highlight(l, r);
            r--;
        }
        if(r <= l) {
            break;
        }
        this.swap(l, r);
        l++;
        r--;
    }

    if(left < l - 1) {
        this.quickSortImpl(left, l - 1);
    }
    if(r + 1 < right) {
        this.quickSortImpl(r + 1, right);
    }
};

SortAlgorithm.prototype.heap = function heapSort() {
    for(var i = 0; i < this.size; i++) {
        this.swapUp(i);
    }

    for(i = this.size - 1; 0 < i; i--) {
        if(this.values[0] > this.values[i]) {
            this.swap(0, i);
        } else {
            this.highlight(0, i);
        }
        this.swapDown(0, i);
    }
};

SortAlgorithm.prototype.swapUp = function(cur) {
    var parent;
    while(cur !== 0) {
        parent = (cur - 1) / 2 | 0;
        if(this.values[parent] >= this.values[cur]) {
            this.highlight(parent, cur);
            break;
        }
        this.swap(parent, cur);
        cur = parent;
    }
};

SortAlgorithm.prototype.swapDown = function(cur, length) {
    var values = this.values;
    var child;
    while(true) {
        child = cur * 2 + 1;
        if(values[child] < values[child + 1]) {
            child += 1;
        }
        if(values[cur] >= values[child]) {
            this.highlight(cur, child);
            break;
        }
        if(length <= child) {
            break;
        }
        this.swap(cur, child);
        cur = child;
    }
};

SortAlgorithm.prototype.bogo = function bogoSort() {
    for(var i = 0; i < this.size; i++) {
        var rnd = (Math.random() * (this.size - i) | 0) + i;
        this.swap(i, rnd);
    }

    // valuesが整列済みになっているか調べる
    for(i = 0; i < this.size - 1; i++) {
        this.highlight(i, i + 1);
        if(this.values[i] > this.values[i + 1]) {
            return;
        }
    }
    this.finished = true;
};


function ViewModel() {
    this.algorithm = ko.observable('Bubble');
    this.size = ko.observable(50);
    this.speed = ko.observable(9);

    this.sort = null;
    this.nums = [];
    this.algorithmList = ['Bubble', 'Selection', 'Shaker', 'Insertion', 'Shell', 'Merge', 'Heap', 'Quick', 'Bogo'];
    this.sizeList = [5, 10, 50, 100, 150];
    this.speedMin = 1;      // 2 seconds
    this.speedMax = 22;     // 4 milliseconds
    this.intervalId = -1;

    graph.init(helper.getCanvas('graph-canvas'));

    this.changed = ko.computed({
        read: function() {
            this.start(this.algorithm(), this.size());
        },
        owner: this,
        deferEvaluation: true,
    });
}

ViewModel.prototype.start = function(algorithm, size) {
    var vm = this;
    this.nums = helper.range(1, size + 1);
    helper.shuffle(this.nums);
    this.sort = new SortAlgorithm(this.nums.slice());

    clearInterval(this.intervalId);
    this.intervalId = setTimeout(animationFrame, 0);

    function animationFrame() {
        if(vm.sort.steps.length === 0) {
            if(vm.sort.finished) {
                graph.draw([-1, -1], vm.nums);
                return;
            } else {
                vm.sort.sort(algorithm.toLowerCase());
                console.log(vm.sort.steps.length);
            }
        }

        var step = vm.sort.steps.pop();
        step.run(vm.nums);
        graph.draw(step.indexes, vm.nums);
        vm.intervalId = setTimeout(animationFrame, vm.getIntervalTime());
    }
};

ViewModel.prototype.restart = function() {
    this.start(this.algorithm.peek(), this.size.peek());
};

ViewModel.prototype.getIntervalTime = function() {
    var speed = parseInt(this.speed.peek(), 10);
    return 2000 / speed / speed | 0;
};


if(document.documentElement.hasAttribute('sort-visualize-app')) {
    document.addEventListener('DOMContentLoaded', main);
}

function main() {
    var vm = window.vm = new ViewModel();
    ko.applyBindings(vm);
    vm.changed();
}
