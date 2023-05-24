package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSubnet
import software.amazon.awscdk.services.ec2.CfnSubnetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSubnet(id: String, props: CfnSubnetProps): CfnSubnet = CfnSubnet(this, id,
    props)

@Generated
public fun Construct.cfnSubnet(
  id: String,
  props: CfnSubnetProps,
  initializer: @AwsCdkDsl CfnSubnet.() -> Unit,
): CfnSubnet = CfnSubnet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSubnet(id: String, initializer: @AwsCdkDsl
    CfnSubnet.Builder.() -> Unit): CfnSubnet = CfnSubnet.Builder.create(this,
    id).apply(initializer).build()
