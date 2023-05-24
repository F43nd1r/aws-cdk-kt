package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolClient
import software.amazon.awscdk.services.cognito.UserPoolClientProps
import software.constructs.Construct

@Generated
public fun Construct.userPoolClient(id: String, props: UserPoolClientProps): UserPoolClient =
    UserPoolClient(this, id, props)

@Generated
public fun Construct.userPoolClient(
  id: String,
  props: UserPoolClientProps,
  initializer: @AwsCdkDsl UserPoolClient.() -> Unit,
): UserPoolClient = UserPoolClient(this, id, props).apply(initializer)

@Generated
public fun Construct.buildUserPoolClient(id: String, initializer: @AwsCdkDsl
    UserPoolClient.Builder.() -> Unit): UserPoolClient = UserPoolClient.Builder.create(this,
    id).apply(initializer).build()
