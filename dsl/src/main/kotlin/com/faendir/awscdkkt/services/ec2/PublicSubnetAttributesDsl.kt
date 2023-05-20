@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PublicSubnetAttributes

public fun publicSubnetAttributes(initializer: PublicSubnetAttributes.Builder.() -> Unit):
    PublicSubnetAttributes = PublicSubnetAttributes.builder().apply(initializer).build()
