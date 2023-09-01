package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.Role
import software.amazon.awscdk.services.iam.RoleProps
import software.constructs.Construct

@Generated
public fun Construct.role(
  id: String,
  props: RoleProps,
  initializer: @AwsCdkDsl Role.() -> Unit = {},
): Role = Role(this, id, props).apply(initializer)

@Generated
public fun Construct.buildRole(id: String, initializer: @AwsCdkDsl Role.Builder.() -> Unit = {}):
    Role = Role.Builder.create(this, id).apply(initializer).build()
