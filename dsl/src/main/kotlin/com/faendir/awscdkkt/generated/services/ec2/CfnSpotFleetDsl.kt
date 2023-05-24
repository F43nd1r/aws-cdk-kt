package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet
import software.amazon.awscdk.services.ec2.CfnSpotFleetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSpotFleet(id: String, props: CfnSpotFleetProps): CfnSpotFleet =
    CfnSpotFleet(this, id, props)

@Generated
public fun Construct.cfnSpotFleet(
  id: String,
  props: CfnSpotFleetProps,
  initializer: @AwsCdkDsl CfnSpotFleet.() -> Unit,
): CfnSpotFleet = CfnSpotFleet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSpotFleet(id: String, initializer: @AwsCdkDsl
    CfnSpotFleet.Builder.() -> Unit): CfnSpotFleet = CfnSpotFleet.Builder.create(this,
    id).apply(initializer).build()
