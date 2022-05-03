package week5;

public class AudioCollage {


    public static double[] amplify(double[] a, double alpha) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * alpha;

        }
        return a;
    }

    public static double[] reverse(double[] a) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }
        return b;
    }

    public static double[] merge(double[] a, double[] b) {
        double[] c = new double[a.length + b.length];
        for (int i = 0; i <= a.length + b.length - 1; i++) {
            if (i < a.length) {
                c[i] = a[i];
            } else
                c[i] = b[i - a.length];
        }
        return c;
    }

    public static double[] mix(double[] a, double[] b) {
        double[] c = new double[Math.max(a.length, b.length)];
        if (c.length == a.length) {
            System.arraycopy(b, 0, c, 0, b.length);
            for (int i = 0; i < c.length; i++) {
                c[i] = c[i] + a[i];
            }
        } else {
            System.arraycopy(a, 0, c, 0, a.length);
            for (int i = 0; i < c.length; i++) {
                c[i] = c[i] + b[i];
            }
        }
        return c;
    }

    public static double[] changeSpeed(double[] a, double alpha) {
        double[] c = new double[(int) (a.length / alpha)];
        for (int i = 0; i < c.length; i++) {
            c[i] = a[(int) (i * alpha)];
        }
        return c;
    }

    private static double checkSequence(double sample) {
        if (sample >= -1 && sample <= 1) {
            return sample;
        }
        return 0;
    }

//    public static void main(String[] args) {
//        double[] beatbox = StdAudio.read("beatbox.wav"),
//                buzzer = StdAudio.read("buzzer.wav"),
//                chimes = StdAudio.read("chimes.wav"),
//                cow = StdAudio.read("cow.wav"),
//                harp = StdAudio.read("harp.wav");
//
//
//        double[] a = merge(cow, mix(harp, mix(changeSpeed(merge(amplify(merge(beatbox, buzzer), 0.5), chimes), 0.5), cow)));
//        StdAudio.play(a);//   }
}

