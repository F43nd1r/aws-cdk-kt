package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions

@Generated
public fun buildElbHealthCheckOptions(initializer: @AwsCdkDsl
    ElbHealthCheckOptions.Builder.() -> Unit): ElbHealthCheckOptions =
    ElbHealthCheckOptions.Builder().apply(initializer).build()
