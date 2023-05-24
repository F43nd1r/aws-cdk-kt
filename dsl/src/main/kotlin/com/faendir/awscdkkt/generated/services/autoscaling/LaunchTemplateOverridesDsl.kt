package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides

@Generated
public fun buildLaunchTemplateOverrides(initializer: @AwsCdkDsl
    LaunchTemplateOverrides.Builder.() -> Unit): LaunchTemplateOverrides =
    LaunchTemplateOverrides.Builder().apply(initializer).build()
