package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes

@Generated
public fun publicDnsNamespaceAttributes(initializer: PublicDnsNamespaceAttributes.Builder.() -> Unit
    = {}): PublicDnsNamespaceAttributes =
    PublicDnsNamespaceAttributes.builder().apply(initializer).build()
