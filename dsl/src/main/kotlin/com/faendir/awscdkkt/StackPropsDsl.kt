package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.StackProps

@Generated
public fun stackProps(initializer: StackProps.Builder.() -> Unit = {}): StackProps =
    StackProps.builder().apply(initializer).build()
