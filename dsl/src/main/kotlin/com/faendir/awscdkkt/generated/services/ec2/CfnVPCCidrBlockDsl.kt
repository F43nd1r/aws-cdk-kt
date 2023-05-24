package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCCidrBlock
import software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPCCidrBlock(id: String, props: CfnVPCCidrBlockProps): CfnVPCCidrBlock =
    CfnVPCCidrBlock(this, id, props)

@Generated
public fun Construct.cfnVPCCidrBlock(
  id: String,
  props: CfnVPCCidrBlockProps,
  initializer: @AwsCdkDsl CfnVPCCidrBlock.() -> Unit,
): CfnVPCCidrBlock = CfnVPCCidrBlock(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVPCCidrBlock(id: String, initializer: @AwsCdkDsl
    CfnVPCCidrBlock.Builder.() -> Unit): CfnVPCCidrBlock = CfnVPCCidrBlock.Builder.create(this,
    id).apply(initializer).build()
