@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Ec2ServiceAttributes

public fun ec2ServiceAttributes(initializer: Ec2ServiceAttributes.Builder.() -> Unit):
    Ec2ServiceAttributes = Ec2ServiceAttributes.builder().apply(initializer).build()
