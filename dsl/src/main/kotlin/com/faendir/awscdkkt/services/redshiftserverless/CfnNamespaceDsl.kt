@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.redshiftserverless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshiftserverless.CfnNamespace
import software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps
import software.constructs.Construct

public fun Construct.cfnNamespace(
  id: String,
  props: CfnNamespaceProps,
  initializer: CfnNamespace.() -> Unit = {},
): CfnNamespace = CfnNamespace(this, id, props).apply(initializer)
