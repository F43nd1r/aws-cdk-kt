@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions

public
    fun applyCloudFormationInitOptions(initializer: ApplyCloudFormationInitOptions.Builder.() -> Unit):
    ApplyCloudFormationInitOptions =
    ApplyCloudFormationInitOptions.builder().apply(initializer).build()
