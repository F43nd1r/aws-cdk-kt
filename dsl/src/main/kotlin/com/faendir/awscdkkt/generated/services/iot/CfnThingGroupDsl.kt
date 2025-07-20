package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnThingGroup
import software.amazon.awscdk.services.iot.CfnThingGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnThingGroup(id: String, initializer: @AwsCdkDsl CfnThingGroup.() -> Unit = {}): CfnThingGroup = CfnThingGroup(this, id).apply(initializer)

@Generated
public fun Construct.cfnThingGroup(
  id: String,
  props: CfnThingGroupProps,
  initializer: @AwsCdkDsl CfnThingGroup.() -> Unit = {},
): CfnThingGroup = CfnThingGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnThingGroup(id: String, initializer: @AwsCdkDsl CfnThingGroup.Builder.() -> Unit = {}): CfnThingGroup = CfnThingGroup.Builder.create(this, id).apply(initializer).build()
