package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet
import software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPrimaryTaskSet(
  id: String,
  props: CfnPrimaryTaskSetProps,
  initializer: @AwsCdkDsl CfnPrimaryTaskSet.() -> Unit = {},
): CfnPrimaryTaskSet = CfnPrimaryTaskSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPrimaryTaskSet(id: String, initializer: @AwsCdkDsl CfnPrimaryTaskSet.Builder.() -> Unit = {}): CfnPrimaryTaskSet = CfnPrimaryTaskSet.Builder.create(this, id).apply(initializer).build()
