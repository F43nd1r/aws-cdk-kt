package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun listenerTlsValidationContextTrustProperty(initializer: CfnVirtualNode.ListenerTlsValidationContextTrustProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.ListenerTlsValidationContextTrustProperty =
    CfnVirtualNode.ListenerTlsValidationContextTrustProperty.builder().apply(initializer).build()
