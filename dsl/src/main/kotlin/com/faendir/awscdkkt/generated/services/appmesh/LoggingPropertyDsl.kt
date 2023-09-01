package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public fun buildLoggingProperty(initializer: @AwsCdkDsl
    CfnVirtualNode.LoggingProperty.Builder.() -> Unit = {}): CfnVirtualNode.LoggingProperty =
    CfnVirtualNode.LoggingProperty.Builder().apply(initializer).build()
