package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnAccount
import software.amazon.awscdk.services.apigateway.CfnAccountProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccount(id: String): CfnAccount = CfnAccount(this, id)

@Generated
public fun Construct.cfnAccount(id: String, initializer: @AwsCdkDsl CfnAccount.() -> Unit):
    CfnAccount = CfnAccount(this, id).apply(initializer)

@Generated
public fun Construct.cfnAccount(id: String, props: CfnAccountProps): CfnAccount = CfnAccount(this,
    id, props)

@Generated
public fun Construct.cfnAccount(
  id: String,
  props: CfnAccountProps,
  initializer: @AwsCdkDsl CfnAccount.() -> Unit,
): CfnAccount = CfnAccount(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccount(id: String, initializer: @AwsCdkDsl
    CfnAccount.Builder.() -> Unit): CfnAccount = CfnAccount.Builder.create(this,
    id).apply(initializer).build()
