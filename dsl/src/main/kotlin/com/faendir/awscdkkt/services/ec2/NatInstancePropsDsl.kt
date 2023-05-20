@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.NatInstanceProps

public fun natInstanceProps(initializer: NatInstanceProps.Builder.() -> Unit): NatInstanceProps =
    NatInstanceProps.builder().apply(initializer).build()
