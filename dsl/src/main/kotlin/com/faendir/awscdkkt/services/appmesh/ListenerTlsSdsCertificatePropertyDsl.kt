package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun listenerTlsSdsCertificateProperty(initializer: CfnVirtualNode.ListenerTlsSdsCertificateProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.ListenerTlsSdsCertificateProperty =
    CfnVirtualNode.ListenerTlsSdsCertificateProperty.builder().apply(initializer).build()
