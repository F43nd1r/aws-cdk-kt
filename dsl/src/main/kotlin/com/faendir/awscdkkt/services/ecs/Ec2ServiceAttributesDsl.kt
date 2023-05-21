package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Ec2ServiceAttributes

@Generated
public fun ec2ServiceAttributes(initializer: Ec2ServiceAttributes.Builder.() -> Unit = {}):
    Ec2ServiceAttributes = Ec2ServiceAttributes.builder().apply(initializer).build()
