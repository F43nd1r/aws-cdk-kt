package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Map
import software.amazon.awscdk.services.stepfunctions.MapProps
import software.constructs.Construct

@Generated
public fun Construct.map(id: String, initializer: Map.() -> Unit = {}): Map = Map(this,
    id).apply(initializer)

@Generated
public fun Construct.map(
  id: String,
  props: MapProps,
  initializer: Map.() -> Unit = {},
): Map = Map(this, id, props).apply(initializer)
