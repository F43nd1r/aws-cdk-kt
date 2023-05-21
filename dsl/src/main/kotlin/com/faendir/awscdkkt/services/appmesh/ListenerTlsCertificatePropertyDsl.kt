package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun listenerTlsCertificateProperty(initializer: CfnVirtualNode.ListenerTlsCertificateProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.ListenerTlsCertificateProperty =
    CfnVirtualNode.ListenerTlsCertificateProperty.builder().apply(initializer).build()
