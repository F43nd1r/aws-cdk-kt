package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.FailProps

@Generated
public fun failProps(initializer: FailProps.Builder.() -> Unit = {}): FailProps =
    FailProps.builder().apply(initializer).build()
