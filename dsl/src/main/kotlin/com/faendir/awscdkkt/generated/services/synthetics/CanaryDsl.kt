package com.faendir.awscdkkt.generated.services.synthetics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.Canary
import software.amazon.awscdk.services.synthetics.CanaryProps
import software.constructs.Construct

@Generated
public fun Construct.canary(
  id: String,
  props: CanaryProps,
  initializer: @AwsCdkDsl Canary.() -> Unit = {},
): Canary = Canary(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCanary(id: String, initializer: @AwsCdkDsl Canary.Builder.() -> Unit =
    {}): Canary = Canary.Builder.create(this, id).apply(initializer).build()
