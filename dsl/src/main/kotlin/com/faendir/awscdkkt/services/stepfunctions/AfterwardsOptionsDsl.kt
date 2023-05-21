package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.AfterwardsOptions

@Generated
public fun afterwardsOptions(initializer: AfterwardsOptions.Builder.() -> Unit = {}):
    AfterwardsOptions = AfterwardsOptions.builder().apply(initializer).build()
