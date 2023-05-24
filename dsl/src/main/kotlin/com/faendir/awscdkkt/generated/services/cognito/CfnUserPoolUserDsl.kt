package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolUser
import software.amazon.awscdk.services.cognito.CfnUserPoolUserProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserPoolUser(id: String, props: CfnUserPoolUserProps): CfnUserPoolUser =
    CfnUserPoolUser(this, id, props)

@Generated
public fun Construct.cfnUserPoolUser(
  id: String,
  props: CfnUserPoolUserProps,
  initializer: @AwsCdkDsl CfnUserPoolUser.() -> Unit,
): CfnUserPoolUser = CfnUserPoolUser(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserPoolUser(id: String, initializer: @AwsCdkDsl
    CfnUserPoolUser.Builder.() -> Unit): CfnUserPoolUser = CfnUserPoolUser.Builder.create(this,
    id).apply(initializer).build()
