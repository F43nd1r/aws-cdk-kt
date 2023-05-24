package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnIdentityPool
import software.amazon.awscdk.services.cognito.CfnIdentityPoolProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIdentityPool(id: String, props: CfnIdentityPoolProps): CfnIdentityPool =
    CfnIdentityPool(this, id, props)

@Generated
public fun Construct.cfnIdentityPool(
  id: String,
  props: CfnIdentityPoolProps,
  initializer: @AwsCdkDsl CfnIdentityPool.() -> Unit,
): CfnIdentityPool = CfnIdentityPool(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIdentityPool(id: String, initializer: @AwsCdkDsl
    CfnIdentityPool.Builder.() -> Unit): CfnIdentityPool = CfnIdentityPool.Builder.create(this,
    id).apply(initializer).build()
