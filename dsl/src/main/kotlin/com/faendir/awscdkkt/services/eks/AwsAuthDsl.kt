@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.AwsAuth
import software.amazon.awscdk.services.eks.AwsAuthProps
import software.constructs.Construct

public fun Construct.awsAuth(
  id: String,
  props: AwsAuthProps,
  initializer: AwsAuth.() -> Unit = {},
): AwsAuth = AwsAuth(this, id, props).apply(initializer)
