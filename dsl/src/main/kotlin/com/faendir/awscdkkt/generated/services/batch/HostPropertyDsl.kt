package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun buildHostProperty(initializer: @AwsCdkDsl
    CfnJobDefinition.HostProperty.Builder.() -> Unit = {}): CfnJobDefinition.HostProperty =
    CfnJobDefinition.HostProperty.Builder().apply(initializer).build()
