package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun tlsValidationContextFileTrustProperty(initializer: CfnVirtualNode.TlsValidationContextFileTrustProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.TlsValidationContextFileTrustProperty =
    CfnVirtualNode.TlsValidationContextFileTrustProperty.builder().apply(initializer).build()
