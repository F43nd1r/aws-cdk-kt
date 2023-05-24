package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnThingType
import software.amazon.awscdk.services.iot.CfnThingTypeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnThingType(id: String): CfnThingType = CfnThingType(this, id)

@Generated
public fun Construct.cfnThingType(id: String, initializer: @AwsCdkDsl CfnThingType.() -> Unit):
    CfnThingType = CfnThingType(this, id).apply(initializer)

@Generated
public fun Construct.cfnThingType(id: String, props: CfnThingTypeProps): CfnThingType =
    CfnThingType(this, id, props)

@Generated
public fun Construct.cfnThingType(
  id: String,
  props: CfnThingTypeProps,
  initializer: @AwsCdkDsl CfnThingType.() -> Unit,
): CfnThingType = CfnThingType(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnThingType(id: String, initializer: @AwsCdkDsl
    CfnThingType.Builder.() -> Unit): CfnThingType = CfnThingType.Builder.create(this,
    id).apply(initializer).build()
