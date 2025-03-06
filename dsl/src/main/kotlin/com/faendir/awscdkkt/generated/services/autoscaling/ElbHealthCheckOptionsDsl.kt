@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions

@Deprecated(message =
    "software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions is deprecated in CDK.")
@Generated
public fun buildElbHealthCheckOptions(initializer: @AwsCdkDsl
    ElbHealthCheckOptions.Builder.() -> Unit = {}): ElbHealthCheckOptions =
    ElbHealthCheckOptions.Builder().apply(initializer).build()
