package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun tlsValidationContextTrustProperty(initializer: CfnVirtualNode.TlsValidationContextTrustProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.TlsValidationContextTrustProperty =
    CfnVirtualNode.TlsValidationContextTrustProperty.builder().apply(initializer).build()
