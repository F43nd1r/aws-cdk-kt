@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps
import software.constructs.Construct

public fun Construct.cfnPublicDnsNamespace(
  id: String,
  props: CfnPublicDnsNamespaceProps,
  initializer: CfnPublicDnsNamespace.() -> Unit = {},
): CfnPublicDnsNamespace = CfnPublicDnsNamespace(this, id, props).apply(initializer)
