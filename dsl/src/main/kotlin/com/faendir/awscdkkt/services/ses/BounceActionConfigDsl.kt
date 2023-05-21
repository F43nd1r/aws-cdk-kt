package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.BounceActionConfig

@Generated
public fun bounceActionConfig(initializer: BounceActionConfig.Builder.() -> Unit = {}):
    BounceActionConfig = BounceActionConfig.builder().apply(initializer).build()
