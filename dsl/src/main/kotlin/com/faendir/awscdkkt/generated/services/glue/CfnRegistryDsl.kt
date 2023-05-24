package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnRegistry
import software.amazon.awscdk.services.glue.CfnRegistryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRegistry(id: String, props: CfnRegistryProps): CfnRegistry =
    CfnRegistry(this, id, props)

@Generated
public fun Construct.cfnRegistry(
  id: String,
  props: CfnRegistryProps,
  initializer: @AwsCdkDsl CfnRegistry.() -> Unit,
): CfnRegistry = CfnRegistry(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRegistry(id: String, initializer: @AwsCdkDsl
    CfnRegistry.Builder.() -> Unit): CfnRegistry = CfnRegistry.Builder.create(this,
    id).apply(initializer).build()
