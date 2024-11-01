package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolGroup
import software.amazon.awscdk.services.cognito.UserPoolGroupProps
import software.constructs.Construct

@Generated
public fun Construct.userPoolGroup(
  id: String,
  props: UserPoolGroupProps,
  initializer: @AwsCdkDsl UserPoolGroup.() -> Unit = {},
): UserPoolGroup = UserPoolGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildUserPoolGroup(id: String, initializer: @AwsCdkDsl
    UserPoolGroup.Builder.() -> Unit = {}): UserPoolGroup = UserPoolGroup.Builder.create(this,
    id).apply(initializer).build()
