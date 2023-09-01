package com.faendir.awscdkkt.generated.services.dms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup
import software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReplicationSubnetGroup(
  id: String,
  props: CfnReplicationSubnetGroupProps,
  initializer: @AwsCdkDsl CfnReplicationSubnetGroup.() -> Unit = {},
): CfnReplicationSubnetGroup = CfnReplicationSubnetGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReplicationSubnetGroup(id: String, initializer: @AwsCdkDsl
    CfnReplicationSubnetGroup.Builder.() -> Unit = {}): CfnReplicationSubnetGroup =
    CfnReplicationSubnetGroup.Builder.create(this, id).apply(initializer).build()
