@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Ec2ServiceProps

public fun ec2ServiceProps(initializer: Ec2ServiceProps.Builder.() -> Unit): Ec2ServiceProps =
    Ec2ServiceProps.builder().apply(initializer).build()
