package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun loggingFormatProperty(initializer: CfnVirtualNode.LoggingFormatProperty.Builder.() -> Unit =
    {}): CfnVirtualNode.LoggingFormatProperty =
    CfnVirtualNode.LoggingFormatProperty.builder().apply(initializer).build()
