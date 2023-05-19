@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.HttpNamespace
import software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps
import software.constructs.Construct

public fun Construct.httpNamespace(
  id: String,
  props: HttpNamespaceProps,
  initializer: HttpNamespace.() -> Unit = {},
): HttpNamespace = HttpNamespace(this, id, props).apply(initializer)
