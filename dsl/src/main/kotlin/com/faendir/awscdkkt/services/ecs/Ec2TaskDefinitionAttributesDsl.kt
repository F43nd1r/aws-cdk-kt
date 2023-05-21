package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Ec2TaskDefinitionAttributes

@Generated
public fun ec2TaskDefinitionAttributes(initializer: Ec2TaskDefinitionAttributes.Builder.() -> Unit =
    {}): Ec2TaskDefinitionAttributes =
    Ec2TaskDefinitionAttributes.builder().apply(initializer).build()
