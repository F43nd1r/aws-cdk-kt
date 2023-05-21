package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.RequestedSubnet

@Generated
public fun requestedSubnet(initializer: RequestedSubnet.Builder.() -> Unit = {}): RequestedSubnet =
    RequestedSubnet.builder().apply(initializer).build()
