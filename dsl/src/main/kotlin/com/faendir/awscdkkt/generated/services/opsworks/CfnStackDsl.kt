package com.faendir.awscdkkt.generated.services.opsworks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnStack
import software.amazon.awscdk.services.opsworks.CfnStackProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStack(
  id: String,
  props: CfnStackProps,
  initializer: @AwsCdkDsl CfnStack.() -> Unit = {},
): CfnStack = CfnStack(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStack(id: String, initializer: @AwsCdkDsl CfnStack.Builder.() -> Unit = {}): CfnStack = CfnStack.Builder.create(this, id).apply(initializer).build()
