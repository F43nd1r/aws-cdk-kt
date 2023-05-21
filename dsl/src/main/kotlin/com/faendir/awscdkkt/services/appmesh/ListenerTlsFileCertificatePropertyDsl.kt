package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun listenerTlsFileCertificateProperty(initializer: CfnVirtualNode.ListenerTlsFileCertificateProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.ListenerTlsFileCertificateProperty =
    CfnVirtualNode.ListenerTlsFileCertificateProperty.builder().apply(initializer).build()
