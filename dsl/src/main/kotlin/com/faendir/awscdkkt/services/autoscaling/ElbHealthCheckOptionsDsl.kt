package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions

@Generated
public fun elbHealthCheckOptions(initializer: ElbHealthCheckOptions.Builder.() -> Unit = {}):
    ElbHealthCheckOptions = ElbHealthCheckOptions.builder().apply(initializer).build()
