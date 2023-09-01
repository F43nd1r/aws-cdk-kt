package com.faendir.awscdkkt.generated.services.redshift

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnClusterSecurityGroup(
  id: String,
  props: CfnClusterSecurityGroupProps,
  initializer: @AwsCdkDsl CfnClusterSecurityGroup.() -> Unit = {},
): CfnClusterSecurityGroup = CfnClusterSecurityGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnClusterSecurityGroup(id: String, initializer: @AwsCdkDsl
    CfnClusterSecurityGroup.Builder.() -> Unit = {}): CfnClusterSecurityGroup =
    CfnClusterSecurityGroup.Builder.create(this, id).apply(initializer).build()
