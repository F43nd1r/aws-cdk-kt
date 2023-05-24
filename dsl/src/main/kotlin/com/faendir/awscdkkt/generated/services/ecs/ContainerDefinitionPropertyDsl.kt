package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun buildContainerDefinitionProperty(initializer: @AwsCdkDsl
    CfnTaskDefinition.ContainerDefinitionProperty.Builder.() -> Unit):
    CfnTaskDefinition.ContainerDefinitionProperty =
    CfnTaskDefinition.ContainerDefinitionProperty.Builder().apply(initializer).build()
