package com.faendir.awscdkkt.generated.services.config

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CustomPolicy
import software.amazon.awscdk.services.config.CustomPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.customPolicy(id: String, props: CustomPolicyProps): CustomPolicy =
    CustomPolicy(this, id, props)

@Generated
public fun Construct.customPolicy(
  id: String,
  props: CustomPolicyProps,
  initializer: @AwsCdkDsl CustomPolicy.() -> Unit,
): CustomPolicy = CustomPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCustomPolicy(id: String, initializer: @AwsCdkDsl
    CustomPolicy.Builder.() -> Unit): CustomPolicy = CustomPolicy.Builder.create(this,
    id).apply(initializer).build()
