package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.StopActionConfig

@Generated
public fun stopActionConfig(initializer: StopActionConfig.Builder.() -> Unit = {}): StopActionConfig
    = StopActionConfig.builder().apply(initializer).build()
