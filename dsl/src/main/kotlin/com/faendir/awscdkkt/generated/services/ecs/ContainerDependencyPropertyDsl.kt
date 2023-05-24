package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun buildContainerDependencyProperty(initializer: @AwsCdkDsl
    CfnTaskDefinition.ContainerDependencyProperty.Builder.() -> Unit):
    CfnTaskDefinition.ContainerDependencyProperty =
    CfnTaskDefinition.ContainerDependencyProperty.Builder().apply(initializer).build()
