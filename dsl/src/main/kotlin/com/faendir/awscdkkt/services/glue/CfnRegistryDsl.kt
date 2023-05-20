@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
