package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps
import software.constructs.Construct

@Generated
public fun Construct.publicDnsNamespace(
  id: String,
  props: PublicDnsNamespaceProps,
  initializer: PublicDnsNamespace.() -> Unit = {},
): PublicDnsNamespace = PublicDnsNamespace(this, id, props).apply(initializer)
