package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEC2Fleet
import software.amazon.awscdk.services.ec2.CfnEC2FleetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEC2Fleet(id: String, props: CfnEC2FleetProps): CfnEC2Fleet =
    CfnEC2Fleet(this, id, props)

@Generated
public fun Construct.cfnEC2Fleet(
  id: String,
  props: CfnEC2FleetProps,
  initializer: @AwsCdkDsl CfnEC2Fleet.() -> Unit,
): CfnEC2Fleet = CfnEC2Fleet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEC2Fleet(id: String, initializer: @AwsCdkDsl
    CfnEC2Fleet.Builder.() -> Unit): CfnEC2Fleet = CfnEC2Fleet.Builder.create(this,
    id).apply(initializer).build()
