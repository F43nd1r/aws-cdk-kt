@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.eventschemas

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eventschemas.CfnRegistry
import software.amazon.awscdk.services.eventschemas.CfnRegistryProps
import software.constructs.Construct

public fun Construct.cfnRegistry(id: String, initializer: CfnRegistry.() -> Unit = {}): CfnRegistry
    = CfnRegistry(this, id).apply(initializer)

public fun Construct.cfnRegistry(
  id: String,
  props: CfnRegistryProps,
  initializer: CfnRegistry.() -> Unit = {},
): CfnRegistry = CfnRegistry(this, id, props).apply(initializer)
