package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation

@Generated
public fun horizontalAnnotation(initializer: HorizontalAnnotation.Builder.() -> Unit = {}):
    HorizontalAnnotation = HorizontalAnnotation.builder().apply(initializer).build()
