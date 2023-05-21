package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.Group
import software.amazon.awscdk.services.iam.GroupProps
import software.constructs.Construct

@Generated
public fun Construct.group(id: String, initializer: Group.() -> Unit = {}): Group = Group(this,
    id).apply(initializer)

@Generated
public fun Construct.group(
  id: String,
  props: GroupProps,
  initializer: Group.() -> Unit = {},
): Group = Group(this, id, props).apply(initializer)
