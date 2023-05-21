package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.StageAttributes

@Generated
public fun stageAttributes(initializer: StageAttributes.Builder.() -> Unit = {}): StageAttributes =
    StageAttributes.builder().apply(initializer).build()
