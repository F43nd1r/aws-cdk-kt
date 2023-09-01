package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.Group
import software.amazon.awscdk.services.iam.GroupProps
import software.constructs.Construct

@Generated
public fun Construct.group(id: String, initializer: @AwsCdkDsl Group.() -> Unit = {}): Group =
    Group(this, id).apply(initializer)

@Generated
public fun Construct.group(
  id: String,
  props: GroupProps,
  initializer: @AwsCdkDsl Group.() -> Unit = {},
): Group = Group(this, id, props).apply(initializer)

@Generated
public fun Construct.buildGroup(id: String, initializer: @AwsCdkDsl Group.Builder.() -> Unit = {}):
    Group = Group.Builder.create(this, id).apply(initializer).build()
