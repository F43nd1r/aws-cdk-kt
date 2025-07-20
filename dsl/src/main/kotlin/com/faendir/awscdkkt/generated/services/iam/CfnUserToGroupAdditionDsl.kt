package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnUserToGroupAddition
import software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserToGroupAddition(
  id: String,
  props: CfnUserToGroupAdditionProps,
  initializer: @AwsCdkDsl CfnUserToGroupAddition.() -> Unit = {},
): CfnUserToGroupAddition = CfnUserToGroupAddition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserToGroupAddition(id: String, initializer: @AwsCdkDsl CfnUserToGroupAddition.Builder.() -> Unit = {}): CfnUserToGroupAddition = CfnUserToGroupAddition.Builder.create(this, id).apply(initializer).build()
