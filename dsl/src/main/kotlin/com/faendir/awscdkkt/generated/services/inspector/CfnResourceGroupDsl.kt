package com.faendir.awscdkkt.generated.services.inspector

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.inspector.CfnResourceGroup
import software.amazon.awscdk.services.inspector.CfnResourceGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceGroup(
  id: String,
  props: CfnResourceGroupProps,
  initializer: @AwsCdkDsl CfnResourceGroup.() -> Unit = {},
): CfnResourceGroup = CfnResourceGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResourceGroup(id: String, initializer: @AwsCdkDsl
    CfnResourceGroup.Builder.() -> Unit = {}): CfnResourceGroup =
    CfnResourceGroup.Builder.create(this, id).apply(initializer).build()
