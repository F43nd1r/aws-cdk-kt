package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl ServiceAccount.() -> Unit = {},
): ServiceAccount = ServiceAccount(this, id, props).apply(initializer)

@Generated
public fun Construct.buildServiceAccount(id: String, initializer: @AwsCdkDsl
    ServiceAccount.Builder.() -> Unit = {}): ServiceAccount = ServiceAccount.Builder.create(this,
    id).apply(initializer).build()
