@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
