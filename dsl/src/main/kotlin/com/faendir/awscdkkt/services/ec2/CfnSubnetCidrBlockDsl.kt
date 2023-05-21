package com.faendir.awscdkkt.services.ec2

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
  initializer: CfnSubnetCidrBlock.() -> Unit = {},
): CfnSubnetCidrBlock = CfnSubnetCidrBlock(this, id, props).apply(initializer)
