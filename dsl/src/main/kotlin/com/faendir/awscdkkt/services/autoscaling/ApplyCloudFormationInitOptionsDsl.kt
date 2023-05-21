package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions

@Generated
public
    fun applyCloudFormationInitOptions(initializer: ApplyCloudFormationInitOptions.Builder.() -> Unit
    = {}): ApplyCloudFormationInitOptions =
    ApplyCloudFormationInitOptions.builder().apply(initializer).build()
