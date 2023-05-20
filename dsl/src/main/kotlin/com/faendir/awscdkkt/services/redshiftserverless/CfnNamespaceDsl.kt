@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
