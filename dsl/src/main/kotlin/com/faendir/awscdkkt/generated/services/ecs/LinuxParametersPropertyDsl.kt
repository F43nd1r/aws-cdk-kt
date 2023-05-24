package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun buildLinuxParametersProperty(initializer: @AwsCdkDsl
    CfnTaskDefinition.LinuxParametersProperty.Builder.() -> Unit):
    CfnTaskDefinition.LinuxParametersProperty =
    CfnTaskDefinition.LinuxParametersProperty.Builder().apply(initializer).build()
