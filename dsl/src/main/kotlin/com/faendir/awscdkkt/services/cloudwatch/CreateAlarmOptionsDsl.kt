package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions

@Generated
public fun createAlarmOptions(initializer: CreateAlarmOptions.Builder.() -> Unit = {}):
    CreateAlarmOptions = CreateAlarmOptions.builder().apply(initializer).build()
