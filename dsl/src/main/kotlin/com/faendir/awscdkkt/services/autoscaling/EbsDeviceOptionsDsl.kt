@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.EbsDeviceOptions

public fun ebsDeviceOptions(initializer: EbsDeviceOptions.Builder.() -> Unit): EbsDeviceOptions =
    EbsDeviceOptions.builder().apply(initializer).build()
