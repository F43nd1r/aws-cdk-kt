package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AllocatedSubnet

@Generated
public fun allocatedSubnet(initializer: AllocatedSubnet.Builder.() -> Unit = {}): AllocatedSubnet =
    AllocatedSubnet.builder().apply(initializer).build()
