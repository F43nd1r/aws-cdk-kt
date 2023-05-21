package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions

@Generated
public fun rotationScheduleOptions(initializer: RotationScheduleOptions.Builder.() -> Unit = {}):
    RotationScheduleOptions = RotationScheduleOptions.builder().apply(initializer).build()
