package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCCidrBlock
import software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPCCidrBlock(
  id: String,
  props: CfnVPCCidrBlockProps,
  initializer: CfnVPCCidrBlock.() -> Unit = {},
): CfnVPCCidrBlock = CfnVPCCidrBlock(this, id, props).apply(initializer)
