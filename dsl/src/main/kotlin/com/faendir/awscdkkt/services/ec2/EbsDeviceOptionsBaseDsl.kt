package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.EbsDeviceOptionsBase

@Generated
public fun ebsDeviceOptionsBase(initializer: EbsDeviceOptionsBase.Builder.() -> Unit = {}):
    EbsDeviceOptionsBase = EbsDeviceOptionsBase.builder().apply(initializer).build()
