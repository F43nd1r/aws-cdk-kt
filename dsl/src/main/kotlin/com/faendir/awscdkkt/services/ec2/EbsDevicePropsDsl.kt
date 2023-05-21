package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.EbsDeviceProps

@Generated
public fun ebsDeviceProps(initializer: EbsDeviceProps.Builder.() -> Unit = {}): EbsDeviceProps =
    EbsDeviceProps.builder().apply(initializer).build()
