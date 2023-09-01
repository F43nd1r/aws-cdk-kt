package com.faendir.awscdkkt.generated.services.memorydb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnSubnetGroup
import software.amazon.awscdk.services.memorydb.CfnSubnetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSubnetGroup(
  id: String,
  props: CfnSubnetGroupProps,
  initializer: @AwsCdkDsl CfnSubnetGroup.() -> Unit = {},
): CfnSubnetGroup = CfnSubnetGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSubnetGroup(id: String, initializer: @AwsCdkDsl
    CfnSubnetGroup.Builder.() -> Unit = {}): CfnSubnetGroup = CfnSubnetGroup.Builder.create(this,
    id).apply(initializer).build()
