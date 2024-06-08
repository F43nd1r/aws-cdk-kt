package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.Fleet
import software.amazon.awscdk.services.codebuild.FleetProps
import software.constructs.Construct

@Generated
public fun Construct.fleet(
  id: String,
  props: FleetProps,
  initializer: @AwsCdkDsl Fleet.() -> Unit = {},
): Fleet = Fleet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildFleet(id: String, initializer: @AwsCdkDsl Fleet.Builder.() -> Unit = {}):
    Fleet = Fleet.Builder.create(this, id).apply(initializer).build()
