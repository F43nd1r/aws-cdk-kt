package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.User
import software.amazon.awscdk.services.iam.UserProps
import software.constructs.Construct

@Generated
public fun Construct.user(id: String, props: UserProps): User = User(this, id, props)

@Generated
public fun Construct.user(
  id: String,
  props: UserProps,
  initializer: @AwsCdkDsl User.() -> Unit,
): User = User(this, id, props).apply(initializer)

@Generated
public fun Construct.user(id: String): User = User(this, id)

@Generated
public fun Construct.user(id: String, initializer: @AwsCdkDsl User.() -> Unit): User = User(this,
    id).apply(initializer)

@Generated
public fun Construct.buildUser(id: String, initializer: @AwsCdkDsl User.Builder.() -> Unit): User =
    User.Builder.create(this, id).apply(initializer).build()
