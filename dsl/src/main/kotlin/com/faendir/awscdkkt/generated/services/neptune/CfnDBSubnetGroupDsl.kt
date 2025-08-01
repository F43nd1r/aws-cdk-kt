package com.faendir.awscdkkt.generated.services.neptune

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.neptune.CfnDBSubnetGroup
import software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDBSubnetGroup(
  id: String,
  props: CfnDBSubnetGroupProps,
  initializer: @AwsCdkDsl CfnDBSubnetGroup.() -> Unit = {},
): CfnDBSubnetGroup = CfnDBSubnetGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDBSubnetGroup(id: String, initializer: @AwsCdkDsl CfnDBSubnetGroup.Builder.() -> Unit = {}): CfnDBSubnetGroup = CfnDBSubnetGroup.Builder.create(this, id).apply(initializer).build()
