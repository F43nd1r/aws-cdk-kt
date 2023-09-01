package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStackSet
import software.amazon.awscdk.services.cloudformation.CfnStackSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStackSet(
  id: String,
  props: CfnStackSetProps,
  initializer: @AwsCdkDsl CfnStackSet.() -> Unit = {},
): CfnStackSet = CfnStackSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStackSet(id: String, initializer: @AwsCdkDsl
    CfnStackSet.Builder.() -> Unit = {}): CfnStackSet = CfnStackSet.Builder.create(this,
    id).apply(initializer).build()
