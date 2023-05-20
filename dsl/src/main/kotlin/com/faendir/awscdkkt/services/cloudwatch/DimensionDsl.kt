@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Dimension

public fun dimension(initializer: Dimension.Builder.() -> Unit): Dimension =
    Dimension.builder().apply(initializer).build()
