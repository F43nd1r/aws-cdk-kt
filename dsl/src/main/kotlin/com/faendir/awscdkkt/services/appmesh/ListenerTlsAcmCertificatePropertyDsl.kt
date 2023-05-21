package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun listenerTlsAcmCertificateProperty(initializer: CfnVirtualNode.ListenerTlsAcmCertificateProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.ListenerTlsAcmCertificateProperty =
    CfnVirtualNode.ListenerTlsAcmCertificateProperty.builder().apply(initializer).build()
