package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes

@Generated
public fun httpNamespaceAttributes(initializer: HttpNamespaceAttributes.Builder.() -> Unit = {}):
    HttpNamespaceAttributes = HttpNamespaceAttributes.builder().apply(initializer).build()
