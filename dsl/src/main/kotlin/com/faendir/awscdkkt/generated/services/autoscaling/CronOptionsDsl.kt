package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CronOptions

@Generated
public fun buildCronOptions(initializer: @AwsCdkDsl CronOptions.Builder.() -> Unit = {}):
    CronOptions = CronOptions.Builder().apply(initializer).build()
