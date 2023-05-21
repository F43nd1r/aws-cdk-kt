package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.EbsDeviceOptionsBase

@Generated
public fun ebsDeviceOptionsBase(initializer: EbsDeviceOptionsBase.Builder.() -> Unit = {}):
    EbsDeviceOptionsBase = EbsDeviceOptionsBase.builder().apply(initializer).build()
