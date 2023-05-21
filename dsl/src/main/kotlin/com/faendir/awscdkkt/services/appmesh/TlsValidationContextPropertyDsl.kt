package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun tlsValidationContextProperty(initializer: CfnVirtualNode.TlsValidationContextProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.TlsValidationContextProperty =
    CfnVirtualNode.TlsValidationContextProperty.builder().apply(initializer).build()
