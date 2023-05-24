package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnThing
import software.amazon.awscdk.services.iot.CfnThingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnThing(id: String): CfnThing = CfnThing(this, id)

@Generated
public fun Construct.cfnThing(id: String, initializer: @AwsCdkDsl CfnThing.() -> Unit): CfnThing =
    CfnThing(this, id).apply(initializer)

@Generated
public fun Construct.cfnThing(id: String, props: CfnThingProps): CfnThing = CfnThing(this, id,
    props)

@Generated
public fun Construct.cfnThing(
  id: String,
  props: CfnThingProps,
  initializer: @AwsCdkDsl CfnThing.() -> Unit,
): CfnThing = CfnThing(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnThing(id: String, initializer: @AwsCdkDsl CfnThing.Builder.() -> Unit):
    CfnThing = CfnThing.Builder.create(this, id).apply(initializer).build()
