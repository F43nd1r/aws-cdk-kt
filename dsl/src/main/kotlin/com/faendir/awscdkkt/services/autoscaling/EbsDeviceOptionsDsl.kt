package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.EbsDeviceOptions

@Generated
public fun ebsDeviceOptions(initializer: EbsDeviceOptions.Builder.() -> Unit = {}): EbsDeviceOptions
    = EbsDeviceOptions.builder().apply(initializer).build()
