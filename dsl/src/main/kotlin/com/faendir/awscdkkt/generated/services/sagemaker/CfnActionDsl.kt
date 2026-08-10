package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnAction
import software.amazon.awscdk.services.sagemaker.CfnActionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAction(
  id: String,
  props: CfnActionProps,
  initializer: @AwsCdkDsl CfnAction.() -> Unit = {},
): CfnAction = CfnAction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAction(id: String, initializer: @AwsCdkDsl CfnAction.Builder.() -> Unit = {}): CfnAction = CfnAction.Builder.create(this, id).apply(initializer).build()
