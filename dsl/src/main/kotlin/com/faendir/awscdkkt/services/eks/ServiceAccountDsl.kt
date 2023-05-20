@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.ServiceAccount
import software.amazon.awscdk.services.eks.ServiceAccountProps
import software.constructs.Construct

public fun Construct.serviceAccount(
  id: String,
  props: ServiceAccountProps,
  initializer: ServiceAccount.() -> Unit = {},
): ServiceAccount = ServiceAccount(this, id, props).apply(initializer)
