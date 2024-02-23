package java.lang.ref;

/**
 * Not a real WeakReference, but just to make things compile.
 *
 * @author Bruno Salmon
 */
public class WeakReference<T> extends SoftReference<T> {

    public WeakReference(T value) {
        super(value);
    }

    public WeakReference(T value, @SuppressWarnings("unused") ReferenceQueue<T> queue) {
        super(value, queue);
    }


}
