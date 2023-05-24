package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun buildLinuxParametersProperty(initializer: @AwsCdkDsl
    CfnJobDefinition.LinuxParametersProperty.Builder.() -> Unit):
    CfnJobDefinition.LinuxParametersProperty =
    CfnJobDefinition.LinuxParametersProperty.Builder().apply(initializer).build()
