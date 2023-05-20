@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.LambdaActionConfig

public fun lambdaActionConfig(initializer: LambdaActionConfig.Builder.() -> Unit):
    LambdaActionConfig = LambdaActionConfig.builder().apply(initializer).build()
