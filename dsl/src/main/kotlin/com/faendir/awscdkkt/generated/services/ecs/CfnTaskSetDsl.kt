package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskSet
import software.amazon.awscdk.services.ecs.CfnTaskSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTaskSet(
  id: String,
  props: CfnTaskSetProps,
  initializer: @AwsCdkDsl CfnTaskSet.() -> Unit = {},
): CfnTaskSet = CfnTaskSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTaskSet(id: String, initializer: @AwsCdkDsl CfnTaskSet.Builder.() -> Unit = {}): CfnTaskSet = CfnTaskSet.Builder.create(this, id).apply(initializer).build()
