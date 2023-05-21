package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.Trail
import software.amazon.awscdk.services.cloudtrail.TrailProps
import software.constructs.Construct

@Generated
public fun Construct.trail(id: String, initializer: Trail.() -> Unit = {}): Trail = Trail(this,
    id).apply(initializer)

@Generated
public fun Construct.trail(
  id: String,
  props: TrailProps,
  initializer: Trail.() -> Unit = {},
): Trail = Trail(this, id, props).apply(initializer)
