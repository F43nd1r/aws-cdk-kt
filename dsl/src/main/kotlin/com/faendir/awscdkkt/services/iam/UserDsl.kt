package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.User
import software.amazon.awscdk.services.iam.UserProps
import software.constructs.Construct

@Generated
public fun Construct.user(id: String, initializer: User.() -> Unit = {}): User = User(this,
    id).apply(initializer)

@Generated
public fun Construct.user(
  id: String,
  props: UserProps,
  initializer: User.() -> Unit = {},
): User = User(this, id, props).apply(initializer)
