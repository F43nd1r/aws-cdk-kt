package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolDomain
import software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserPoolDomain(
  id: String,
  props: CfnUserPoolDomainProps,
  initializer: @AwsCdkDsl CfnUserPoolDomain.() -> Unit = {},
): CfnUserPoolDomain = CfnUserPoolDomain(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserPoolDomain(id: String, initializer: @AwsCdkDsl
    CfnUserPoolDomain.Builder.() -> Unit = {}): CfnUserPoolDomain =
    CfnUserPoolDomain.Builder.create(this, id).apply(initializer).build()
