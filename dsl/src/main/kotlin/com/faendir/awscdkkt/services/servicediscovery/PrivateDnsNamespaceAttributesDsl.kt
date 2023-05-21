package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceAttributes

@Generated
public
    fun privateDnsNamespaceAttributes(initializer: PrivateDnsNamespaceAttributes.Builder.() -> Unit
    = {}): PrivateDnsNamespaceAttributes =
    PrivateDnsNamespaceAttributes.builder().apply(initializer).build()
