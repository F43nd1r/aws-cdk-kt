package com.faendir.awscdkkt.generated.services.ssm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnOpsItem
import software.amazon.awscdk.services.ssm.CfnOpsItemProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOpsItem(
  id: String,
  props: CfnOpsItemProps,
  initializer: @AwsCdkDsl CfnOpsItem.() -> Unit = {},
): CfnOpsItem = CfnOpsItem(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOpsItem(id: String, initializer: @AwsCdkDsl CfnOpsItem.Builder.() -> Unit = {}): CfnOpsItem = CfnOpsItem.Builder.create(this, id).apply(initializer).build()
