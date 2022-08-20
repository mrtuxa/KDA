package space.mrtuxa.kda.annotations

/**
 * Functionality annotated with ForRemoval will no longer be supported
 * and should not be used anymore in new code.
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
annotation class ForRemoval(
    /**
     * Version which will most likely remove this feature.
     *
     * @return The deadline version or N/A if this isn't known yet
     */
    val deadline: String = "N/A"
)