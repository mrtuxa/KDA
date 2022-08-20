package space.mrtuxa.kda.annotations

/**
 * Functionality annotated with Incubating might change in a future release.
 * This means the binary interface or similar changes could disrupt the updating process.
 *
 *
 * This will often be done for API features that are not officially released to bots or in general, yet.
 */
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
@Target(
    AnnotationTarget.ANNOTATION_CLASS,
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.FIELD,
    AnnotationTarget.CONSTRUCTOR
)
annotation class Incubating 