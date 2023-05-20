@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.User
import software.amazon.awscdk.services.iam.UserProps
import software.constructs.Construct

public fun Construct.user(id: String, initializer: User.() -> Unit = {}): User = User(this,
    id).apply(initializer)

public fun Construct.user(
  id: String,
  props: UserProps,
  initializer: User.() -> Unit = {},
): User = User(this, id, props).apply(initializer)
