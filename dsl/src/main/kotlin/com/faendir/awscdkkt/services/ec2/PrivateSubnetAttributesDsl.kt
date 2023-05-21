package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PrivateSubnetAttributes

@Generated
public fun privateSubnetAttributes(initializer: PrivateSubnetAttributes.Builder.() -> Unit = {}):
    PrivateSubnetAttributes = PrivateSubnetAttributes.builder().apply(initializer).build()
