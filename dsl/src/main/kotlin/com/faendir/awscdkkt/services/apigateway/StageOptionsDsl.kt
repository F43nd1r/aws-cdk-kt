package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.StageOptions

@Generated
public fun stageOptions(initializer: StageOptions.Builder.() -> Unit = {}): StageOptions =
    StageOptions.builder().apply(initializer).build()
