package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.EbsDeviceProps

@Generated
public fun ebsDeviceProps(initializer: EbsDeviceProps.Builder.() -> Unit = {}): EbsDeviceProps =
    EbsDeviceProps.builder().apply(initializer).build()
