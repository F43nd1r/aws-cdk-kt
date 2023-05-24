package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions

@Generated
public fun buildRotationScheduleOptions(initializer: @AwsCdkDsl
    RotationScheduleOptions.Builder.() -> Unit): RotationScheduleOptions =
    RotationScheduleOptions.Builder().apply(initializer).build()
