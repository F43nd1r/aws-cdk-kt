package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Ec2ServiceProps

@Generated
public fun ec2ServiceProps(initializer: Ec2ServiceProps.Builder.() -> Unit = {}): Ec2ServiceProps =
    Ec2ServiceProps.builder().apply(initializer).build()
