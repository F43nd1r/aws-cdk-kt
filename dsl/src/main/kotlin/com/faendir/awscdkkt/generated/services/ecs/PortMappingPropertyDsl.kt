package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun buildPortMappingProperty(initializer: @AwsCdkDsl
    CfnTaskDefinition.PortMappingProperty.Builder.() -> Unit = {}):
    CfnTaskDefinition.PortMappingProperty =
    CfnTaskDefinition.PortMappingProperty.Builder().apply(initializer).build()
