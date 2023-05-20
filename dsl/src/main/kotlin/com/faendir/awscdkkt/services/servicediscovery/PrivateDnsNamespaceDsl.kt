@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps
import software.constructs.Construct

public fun Construct.privateDnsNamespace(
  id: String,
  props: PrivateDnsNamespaceProps,
  initializer: PrivateDnsNamespace.() -> Unit = {},
): PrivateDnsNamespace = PrivateDnsNamespace(this, id, props).apply(initializer)
