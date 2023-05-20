@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.User
import software.amazon.awscdk.services.iam.UserProps
import software.constructs.Construct

public fun Construct.user(
  id: String,
  props: UserProps,
  initializer: User.() -> Unit = {},
): User = User(this, id, props).apply(initializer)

public fun Construct.user(id: String, initializer: User.() -> Unit = {}): User = User(this,
    id).apply(initializer)
