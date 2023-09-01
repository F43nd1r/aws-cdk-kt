package com.faendir.awscdkkt.generated.services.eventschemas

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eventschemas.CfnRegistry
import software.amazon.awscdk.services.eventschemas.CfnRegistryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRegistry(id: String, initializer: @AwsCdkDsl CfnRegistry.() -> Unit = {}):
    CfnRegistry = CfnRegistry(this, id).apply(initializer)

@Generated
public fun Construct.cfnRegistry(
  id: String,
  props: CfnRegistryProps,
  initializer: @AwsCdkDsl CfnRegistry.() -> Unit = {},
): CfnRegistry = CfnRegistry(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRegistry(id: String, initializer: @AwsCdkDsl
    CfnRegistry.Builder.() -> Unit = {}): CfnRegistry = CfnRegistry.Builder.create(this,
    id).apply(initializer).build()
