package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBSecurityGroup
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDBSecurityGroup(
  id: String,
  props: CfnDBSecurityGroupProps,
  initializer: @AwsCdkDsl CfnDBSecurityGroup.() -> Unit = {},
): CfnDBSecurityGroup = CfnDBSecurityGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDBSecurityGroup(id: String, initializer: @AwsCdkDsl
    CfnDBSecurityGroup.Builder.() -> Unit = {}): CfnDBSecurityGroup =
    CfnDBSecurityGroup.Builder.create(this, id).apply(initializer).build()
