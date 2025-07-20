package com.faendir.awscdkkt.generated.services.dax

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dax.CfnSubnetGroup
import software.amazon.awscdk.services.dax.CfnSubnetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSubnetGroup(
  id: String,
  props: CfnSubnetGroupProps,
  initializer: @AwsCdkDsl CfnSubnetGroup.() -> Unit = {},
): CfnSubnetGroup = CfnSubnetGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSubnetGroup(id: String, initializer: @AwsCdkDsl CfnSubnetGroup.Builder.() -> Unit = {}): CfnSubnetGroup = CfnSubnetGroup.Builder.create(this, id).apply(initializer).build()
