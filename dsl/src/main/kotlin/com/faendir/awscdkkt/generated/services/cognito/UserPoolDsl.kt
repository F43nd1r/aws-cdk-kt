package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPool
import software.amazon.awscdk.services.cognito.UserPoolProps
import software.constructs.Construct

@Generated
public fun Construct.userPool(id: String, initializer: @AwsCdkDsl UserPool.() -> Unit = {}): UserPool = UserPool(this, id).apply(initializer)

@Generated
public fun Construct.userPool(
  id: String,
  props: UserPoolProps,
  initializer: @AwsCdkDsl UserPool.() -> Unit = {},
): UserPool = UserPool(this, id, props).apply(initializer)

@Generated
public fun Construct.buildUserPool(id: String, initializer: @AwsCdkDsl UserPool.Builder.() -> Unit = {}): UserPool = UserPool.Builder.create(this, id).apply(initializer).build()
