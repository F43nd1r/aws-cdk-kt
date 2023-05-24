package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPC
import software.amazon.awscdk.services.ec2.CfnVPCProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPC(id: String): CfnVPC = CfnVPC(this, id)

@Generated
public fun Construct.cfnVPC(id: String, initializer: @AwsCdkDsl CfnVPC.() -> Unit): CfnVPC =
    CfnVPC(this, id).apply(initializer)

@Generated
public fun Construct.cfnVPC(id: String, props: CfnVPCProps): CfnVPC = CfnVPC(this, id, props)

@Generated
public fun Construct.cfnVPC(
  id: String,
  props: CfnVPCProps,
  initializer: @AwsCdkDsl CfnVPC.() -> Unit,
): CfnVPC = CfnVPC(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVPC(id: String, initializer: @AwsCdkDsl CfnVPC.Builder.() -> Unit):
    CfnVPC = CfnVPC.Builder.create(this, id).apply(initializer).build()
