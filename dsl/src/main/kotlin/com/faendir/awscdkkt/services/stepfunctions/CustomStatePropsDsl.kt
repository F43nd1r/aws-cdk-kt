package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.CustomStateProps

@Generated
public fun customStateProps(initializer: CustomStateProps.Builder.() -> Unit = {}): CustomStateProps
    = CustomStateProps.builder().apply(initializer).build()
