package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSecurityGroup
import software.amazon.awscdk.services.ec2.CfnSecurityGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecurityGroup(
  id: String,
  props: CfnSecurityGroupProps,
  initializer: @AwsCdkDsl CfnSecurityGroup.() -> Unit = {},
): CfnSecurityGroup = CfnSecurityGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSecurityGroup(id: String, initializer: @AwsCdkDsl CfnSecurityGroup.Builder.() -> Unit = {}): CfnSecurityGroup = CfnSecurityGroup.Builder.create(this, id).apply(initializer).build()
