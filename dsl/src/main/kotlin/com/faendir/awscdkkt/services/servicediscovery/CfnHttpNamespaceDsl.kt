@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.CfnHttpNamespace
import software.amazon.awscdk.services.servicediscovery.CfnHttpNamespaceProps
import software.constructs.Construct

public fun Construct.cfnHttpNamespace(
  id: String,
  props: CfnHttpNamespaceProps,
  initializer: CfnHttpNamespace.() -> Unit = {},
): CfnHttpNamespace = CfnHttpNamespace(this, id, props).apply(initializer)
