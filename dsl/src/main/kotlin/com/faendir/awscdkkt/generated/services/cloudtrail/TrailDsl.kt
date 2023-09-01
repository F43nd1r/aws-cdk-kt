package com.faendir.awscdkkt.generated.services.cloudtrail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.Trail
import software.amazon.awscdk.services.cloudtrail.TrailProps
import software.constructs.Construct

@Generated
public fun Construct.trail(id: String, initializer: @AwsCdkDsl Trail.() -> Unit = {}): Trail =
    Trail(this, id).apply(initializer)

@Generated
public fun Construct.trail(
  id: String,
  props: TrailProps,
  initializer: @AwsCdkDsl Trail.() -> Unit = {},
): Trail = Trail(this, id, props).apply(initializer)

@Generated
public fun Construct.buildTrail(id: String, initializer: @AwsCdkDsl Trail.Builder.() -> Unit = {}):
    Trail = Trail.Builder.create(this, id).apply(initializer).build()
