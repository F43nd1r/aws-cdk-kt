package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration

@Generated
public fun resultConfiguration(initializer: ResultConfiguration.Builder.() -> Unit = {}):
    ResultConfiguration = ResultConfiguration.builder().apply(initializer).build()
