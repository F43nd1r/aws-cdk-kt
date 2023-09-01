package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.InstanceProfile
import software.amazon.awscdk.services.iam.InstanceProfileProps
import software.constructs.Construct

@Generated
public fun Construct.instanceProfile(id: String, initializer: @AwsCdkDsl InstanceProfile.() -> Unit
    = {}): InstanceProfile = InstanceProfile(this, id).apply(initializer)

@Generated
public fun Construct.instanceProfile(
  id: String,
  props: InstanceProfileProps,
  initializer: @AwsCdkDsl InstanceProfile.() -> Unit = {},
): InstanceProfile = InstanceProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildInstanceProfile(id: String, initializer: @AwsCdkDsl
    InstanceProfile.Builder.() -> Unit = {}): InstanceProfile = InstanceProfile.Builder.create(this,
    id).apply(initializer).build()
