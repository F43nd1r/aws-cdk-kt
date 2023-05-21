package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun clientTlsCertificateProperty(initializer: CfnVirtualNode.ClientTlsCertificateProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.ClientTlsCertificateProperty =
    CfnVirtualNode.ClientTlsCertificateProperty.builder().apply(initializer).build()
