package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.LazyRole
import software.amazon.awscdk.services.iam.LazyRoleProps
import software.constructs.Construct

@Generated
public fun Construct.lazyRole(
  id: String,
  props: LazyRoleProps,
  initializer: @AwsCdkDsl LazyRole.() -> Unit = {},
): LazyRole = LazyRole(this, id, props).apply(initializer)

@Generated
public fun Construct.buildLazyRole(id: String, initializer: @AwsCdkDsl LazyRole.Builder.() -> Unit =
    {}): LazyRole = LazyRole.Builder.create(this, id).apply(initializer).build()
