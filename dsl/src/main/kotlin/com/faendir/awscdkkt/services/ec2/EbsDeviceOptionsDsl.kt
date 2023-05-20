@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.EbsDeviceOptions

public fun ebsDeviceOptions(initializer: EbsDeviceOptions.Builder.() -> Unit): EbsDeviceOptions =
    EbsDeviceOptions.builder().apply(initializer).build()
