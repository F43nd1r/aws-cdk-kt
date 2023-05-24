package com.faendir.awscdkkt.generated.services.redshift

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup
import software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnClusterSubnetGroup(id: String, props: CfnClusterSubnetGroupProps):
    CfnClusterSubnetGroup = CfnClusterSubnetGroup(this, id, props)

@Generated
public fun Construct.cfnClusterSubnetGroup(
  id: String,
  props: CfnClusterSubnetGroupProps,
  initializer: @AwsCdkDsl CfnClusterSubnetGroup.() -> Unit,
): CfnClusterSubnetGroup = CfnClusterSubnetGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnClusterSubnetGroup(id: String, initializer: @AwsCdkDsl
    CfnClusterSubnetGroup.Builder.() -> Unit): CfnClusterSubnetGroup =
    CfnClusterSubnetGroup.Builder.create(this, id).apply(initializer).build()
