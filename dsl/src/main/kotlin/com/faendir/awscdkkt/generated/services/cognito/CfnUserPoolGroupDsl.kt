package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolGroup
import software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserPoolGroup(
  id: String,
  props: CfnUserPoolGroupProps,
  initializer: @AwsCdkDsl CfnUserPoolGroup.() -> Unit = {},
): CfnUserPoolGroup = CfnUserPoolGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserPoolGroup(id: String, initializer: @AwsCdkDsl CfnUserPoolGroup.Builder.() -> Unit = {}): CfnUserPoolGroup = CfnUserPoolGroup.Builder.create(this, id).apply(initializer).build()
