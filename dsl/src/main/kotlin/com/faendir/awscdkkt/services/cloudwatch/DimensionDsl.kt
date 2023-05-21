package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Dimension

@Generated
public fun dimension(initializer: Dimension.Builder.() -> Unit = {}): Dimension =
    Dimension.builder().apply(initializer).build()
