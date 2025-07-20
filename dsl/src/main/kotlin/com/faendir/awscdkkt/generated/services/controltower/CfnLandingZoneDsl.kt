package com.faendir.awscdkkt.generated.services.controltower

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.controltower.CfnLandingZone
import software.amazon.awscdk.services.controltower.CfnLandingZoneProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLandingZone(
  id: String,
  props: CfnLandingZoneProps,
  initializer: @AwsCdkDsl CfnLandingZone.() -> Unit = {},
): CfnLandingZone = CfnLandingZone(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLandingZone(id: String, initializer: @AwsCdkDsl CfnLandingZone.Builder.() -> Unit = {}): CfnLandingZone = CfnLandingZone.Builder.create(this, id).apply(initializer).build()
