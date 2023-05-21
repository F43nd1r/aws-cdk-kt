package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.RotationScheduleProps

@Generated
public fun rotationScheduleProps(initializer: RotationScheduleProps.Builder.() -> Unit = {}):
    RotationScheduleProps = RotationScheduleProps.builder().apply(initializer).build()
