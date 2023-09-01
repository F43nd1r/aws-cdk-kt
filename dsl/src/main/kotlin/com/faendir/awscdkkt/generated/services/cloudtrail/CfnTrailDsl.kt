package com.faendir.awscdkkt.generated.services.cloudtrail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnTrail
import software.amazon.awscdk.services.cloudtrail.CfnTrailProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTrail(
  id: String,
  props: CfnTrailProps,
  initializer: @AwsCdkDsl CfnTrail.() -> Unit = {},
): CfnTrail = CfnTrail(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTrail(id: String, initializer: @AwsCdkDsl CfnTrail.Builder.() -> Unit =
    {}): CfnTrail = CfnTrail.Builder.create(this, id).apply(initializer).build()
