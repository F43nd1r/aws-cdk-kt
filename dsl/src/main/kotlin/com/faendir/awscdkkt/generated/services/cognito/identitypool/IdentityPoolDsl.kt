package com.faendir.awscdkkt.generated.services.cognito.identitypool

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.identitypool.IdentityPool
import software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProps
import software.constructs.Construct

@Generated
public fun Construct.identityPool(id: String, initializer: @AwsCdkDsl IdentityPool.() -> Unit = {}):
    IdentityPool = IdentityPool(this, id).apply(initializer)

@Generated
public fun Construct.identityPool(
  id: String,
  props: IdentityPoolProps,
  initializer: @AwsCdkDsl IdentityPool.() -> Unit = {},
): IdentityPool = IdentityPool(this, id, props).apply(initializer)

@Generated
public fun Construct.buildIdentityPool(id: String, initializer: @AwsCdkDsl
    IdentityPool.Builder.() -> Unit = {}): IdentityPool = IdentityPool.Builder.create(this,
    id).apply(initializer).build()
