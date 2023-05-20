@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.Group
import software.amazon.awscdk.services.iam.GroupProps
import software.constructs.Construct

public fun Construct.group(id: String, initializer: Group.() -> Unit = {}): Group = Group(this,
    id).apply(initializer)

public fun Construct.group(
  id: String,
  props: GroupProps,
  initializer: Group.() -> Unit = {},
): Group = Group(this, id, props).apply(initializer)
