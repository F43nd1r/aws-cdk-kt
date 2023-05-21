package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPrivateDnsNamespace(
  id: String,
  props: CfnPrivateDnsNamespaceProps,
  initializer: CfnPrivateDnsNamespace.() -> Unit = {},
): CfnPrivateDnsNamespace = CfnPrivateDnsNamespace(this, id, props).apply(initializer)
