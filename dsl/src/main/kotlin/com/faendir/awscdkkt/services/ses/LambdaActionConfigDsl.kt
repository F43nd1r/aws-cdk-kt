package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.LambdaActionConfig

@Generated
public fun lambdaActionConfig(initializer: LambdaActionConfig.Builder.() -> Unit = {}):
    LambdaActionConfig = LambdaActionConfig.builder().apply(initializer).build()
