package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun tlsValidationContextAcmTrustProperty(initializer: CfnVirtualNode.TlsValidationContextAcmTrustProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.TlsValidationContextAcmTrustProperty =
    CfnVirtualNode.TlsValidationContextAcmTrustProperty.builder().apply(initializer).build()
