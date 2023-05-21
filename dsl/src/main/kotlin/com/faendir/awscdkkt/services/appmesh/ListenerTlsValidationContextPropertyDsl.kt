package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun listenerTlsValidationContextProperty(initializer: CfnVirtualNode.ListenerTlsValidationContextProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.ListenerTlsValidationContextProperty =
    CfnVirtualNode.ListenerTlsValidationContextProperty.builder().apply(initializer).build()
