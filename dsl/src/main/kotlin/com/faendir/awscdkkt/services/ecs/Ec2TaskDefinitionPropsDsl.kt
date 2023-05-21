package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps

@Generated
public fun ec2TaskDefinitionProps(initializer: Ec2TaskDefinitionProps.Builder.() -> Unit = {}):
    Ec2TaskDefinitionProps = Ec2TaskDefinitionProps.builder().apply(initializer).build()
