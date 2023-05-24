package com.faendir.awscdkkt.generated.services.autoscaling.common

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.common.Alarms

@Generated
public fun buildAlarms(initializer: @AwsCdkDsl Alarms.Builder.() -> Unit): Alarms =
    Alarms.Builder().apply(initializer).build()
