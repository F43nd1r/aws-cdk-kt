@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnRegistry
import software.amazon.awscdk.services.glue.CfnRegistryProps
import software.constructs.Construct

public fun Construct.cfnRegistry(
  id: String,
  props: CfnRegistryProps,
  initializer: CfnRegistry.() -> Unit = {},
): CfnRegistry = CfnRegistry(this, id, props).apply(initializer)
