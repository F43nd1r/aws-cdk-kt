@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions

public
    fun applyCloudFormationInitOptions(initializer: ApplyCloudFormationInitOptions.Builder.() -> Unit):
    ApplyCloudFormationInitOptions =
    ApplyCloudFormationInitOptions.builder().apply(initializer).build()
