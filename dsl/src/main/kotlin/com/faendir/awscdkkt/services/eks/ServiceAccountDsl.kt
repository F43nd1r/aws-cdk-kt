package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.ServiceAccount
import software.amazon.awscdk.services.eks.ServiceAccountProps
import software.constructs.Construct

@Generated
public fun Construct.serviceAccount(
  id: String,
  props: ServiceAccountProps,
  initializer: ServiceAccount.() -> Unit = {},
): ServiceAccount = ServiceAccount(this, id, props).apply(initializer)
