package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolResourceServer
import software.amazon.awscdk.services.cognito.UserPoolResourceServerProps
import software.constructs.Construct

@Generated
public fun Construct.userPoolResourceServer(
  id: String,
  props: UserPoolResourceServerProps,
  initializer: @AwsCdkDsl UserPoolResourceServer.() -> Unit = {},
): UserPoolResourceServer = UserPoolResourceServer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildUserPoolResourceServer(id: String, initializer: @AwsCdkDsl UserPoolResourceServer.Builder.() -> Unit = {}): UserPoolResourceServer = UserPoolResourceServer.Builder.create(this, id).apply(initializer).build()
