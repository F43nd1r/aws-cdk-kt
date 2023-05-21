package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnManagedPolicy
import software.amazon.awscdk.services.iam.CfnManagedPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnManagedPolicy(
  id: String,
  props: CfnManagedPolicyProps,
  initializer: CfnManagedPolicy.() -> Unit = {},
): CfnManagedPolicy = CfnManagedPolicy(this, id, props).apply(initializer)
