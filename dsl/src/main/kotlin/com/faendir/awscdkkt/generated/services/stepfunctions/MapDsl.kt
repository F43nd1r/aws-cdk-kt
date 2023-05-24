package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Map
import software.amazon.awscdk.services.stepfunctions.MapProps
import software.constructs.Construct

@Generated
public fun Construct.map(id: String): Map = Map(this, id)

@Generated
public fun Construct.map(id: String, initializer: @AwsCdkDsl Map.() -> Unit): Map = Map(this,
    id).apply(initializer)

@Generated
public fun Construct.map(id: String, props: MapProps): Map = Map(this, id, props)

@Generated
public fun Construct.map(
  id: String,
  props: MapProps,
  initializer: @AwsCdkDsl Map.() -> Unit,
): Map = Map(this, id, props).apply(initializer)

@Generated
public fun Construct.buildMap(id: String, initializer: @AwsCdkDsl Map.Builder.() -> Unit): Map =
    Map.Builder.create(this, id).apply(initializer).build()
