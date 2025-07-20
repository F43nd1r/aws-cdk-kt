package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock
import software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSubnetCidrBlock(
  id: String,
  props: CfnSubnetCidrBlockProps,
  initializer: @AwsCdkDsl CfnSubnetCidrBlock.() -> Unit = {},
): CfnSubnetCidrBlock = CfnSubnetCidrBlock(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSubnetCidrBlock(id: String, initializer: @AwsCdkDsl CfnSubnetCidrBlock.Builder.() -> Unit = {}): CfnSubnetCidrBlock = CfnSubnetCidrBlock.Builder.create(this, id).apply(initializer).build()
